package com.lucasjosino.database;

import com.lucasjosino.models.Address;
import com.lucasjosino.models.Bank;
import com.lucasjosino.models.Contact;
import com.lucasjosino.models.account.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IBIS extends Bank {

    private final List<Bank> banks = new ArrayList<>();

    public List<Bank> getBanks() {
        return banks;
    }

    public void listBanks() {
        System.out.println("******** List of Banks ********");
        for (Bank bank : banks) {
            System.out.println("Name: " + bank.getName());
            System.out.println("Code: " + bank.getCode());
            System.out.println(bank.getContact());
            System.out.println(bank.getAddress());
            System.out.println();
        }
    }

    public Bank getBank(UUID uuid) {
        for (Bank bank : banks) {
            if (bank.getUuid() == uuid) return bank;
        }
        return null;
    }

    public void addBank(Bank newBank) {
        banks.add(newBank);
    }

    public void removeBank(UUID uuid) {
        banks.removeIf(bank -> bank.getUuid() == uuid);
    }

    @Override
    public UUID getUuid() {
        return UUID.fromString("3f488a86-7d69-454e-8e82-d3f2ad1aaf9c");
    }

    public String getName() {
        return "Imaginary Bank for International Settlements";
    }

    public int getCode() {
        return 0;
    }

    public Contact getContact() {
        return new Contact(
                "49841293718",
                "https://ibis.iorg",
                "contact@ibis.org"
        );
    }

    public Address getAddress() {
        return new Address(
                "798 N Milvaotem Street",
                "Xichago",
                "Endanna",
                "51379",
                "Imaginary States",
                "Endanna"
        );
    }
}
