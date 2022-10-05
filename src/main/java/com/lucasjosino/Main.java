package com.lucasjosino;

import com.lucasjosino.database.IBIS;
import com.lucasjosino.enums.AccountType;
import com.lucasjosino.models.Address;
import com.lucasjosino.models.Bank;
import com.lucasjosino.models.Contact;
import com.lucasjosino.models.account.CurrentAccount;
import com.lucasjosino.models.account.SavingsAccount;

public class Main {

    // Imaginary Bank for International Settlements (IBIS).
    private static final IBIS ibis = new IBIS();

    public static void main(String[] args) {
        // Create banks and print all.
        setupBanks();

        // Print ibis info.
        printIBIS();

        // Create 'john' account.
        CurrentAccount john = (CurrentAccount) ibis.getBanks().get(0).createAccount(
                "John Doe",
                AccountType.CURRENT_ACCOUNT
        );

        // Create 'maria' account.
        SavingsAccount maria = (SavingsAccount) ibis.getBanks().get(1).createAccount(
                "Maria Doe",
                AccountType.SAVINGS_ACCOUNT
        );

        System.out.println("******** Actions ********");

        // Action 1
        john.deposit(2540);
        john.transfer(maria, 1100);

        // Print
        System.out.println(john);
        System.out.println(maria);
        System.out.println();

        // Action 2
        john.transfer(maria, 100);
        john.withdraw(200);
        maria.withdraw(500);

        // Print
        System.out.println(john);
        System.out.println(maria);
        System.out.println();

        // Action 3
        john.deposit(5000);
        maria.transfer(john, 699);

        // Print 'john' info using 'get' methods.
        System.out.println("******** John ********");
        System.out.println("UUID: " + john.getUuid());
        System.out.println("Code: " + john.getCode());
        System.out.println("Balance: " + john.getBalance());
        System.out.println("Number: " + john.getNumber());
        System.out.println("Limit: " + john.getLimit());
        System.out.println("OwnerName: " + john.getOwnerName());

        System.out.println();

        // Print 'maria' info using 'get' methods.
        System.out.println("******** Maria ********");
        System.out.println("UUID: " + maria.getUuid());
        System.out.println("Code: " + maria.getCode());
        System.out.println("Balance: " + maria.getBalance());
        System.out.println("Number: " + maria.getNumber());
        System.out.println("Limit: " + maria.getLimit());
        System.out.println("OwnerName: " + maria.getOwnerName());
    }

    private static void printIBIS() {
        System.out.println("******** IBIS ********");
        System.out.println(ibis.getUuid());
        System.out.println(ibis.getName());
        System.out.println(ibis.getCode());
        System.out.println(ibis.getAddress());
        System.out.println(ibis.getContact());
        System.out.println();
        ibis.listBanks();
    }

    private static void setupBanks() {
        Bank hooluyBank = new Bank(
                "Hooluy Bank",
                new Contact(
                        "74354791579",
                        "https://hoolubank.com",
                        "support@hoolubank.com"
                ),
                new Address(
                        "8806 N 17th St",
                        "Nooslurg",
                        "Florindo",
                        "48219",
                        "Imaginary States",
                        "Florindo"
                )
        );

        Bank yayBank = new Bank(
                "Yay Bank",
                new Contact(
                        "97314572198",
                        "https://yaybank.com",
                        "support@yaybank.com"
                ),
                new Address(
                        "8914 Lower Im Rt",
                        "Zaambu",
                        "Summer Render",
                        "45893",
                        "Imaginary States",
                        "Summer Render"
                )
        );

        ibis.addBank(hooluyBank);
        ibis.addBank(yayBank);
    }
}