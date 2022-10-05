package com.lucasjosino.models;

import com.lucasjosino.enums.AccountType;
import com.lucasjosino.interfaces.BankActions;
import com.lucasjosino.models.account.Account;
import com.lucasjosino.models.account.CurrentAccount;
import com.lucasjosino.models.account.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Bank implements BankActions {
    private UUID uuid;
    private String name;
    private int code;
    private Contact contact;
    private Address address;

    private final List<Account> accounts = new ArrayList<>();

    public Bank() {
    }

    public Bank(String name, Contact contact, Address address) {
        Random random = new Random();

        this.uuid = UUID.randomUUID();
        this.name = name;
        this.code = random.nextInt(999);
        this.contact = contact;
        this.address = address;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public Contact getContact() {
        return contact;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Account createAccount(String ownerName, AccountType type) {
        Account newAccount;

        if (type == AccountType.CURRENT_ACCOUNT) {
            newAccount = new CurrentAccount(ownerName, this);
        } else {
            newAccount = new SavingsAccount(ownerName, this);
        }

        return newAccount;
    }

    @Override
    public void deleteAccount(UUID uuid) {
        accounts.removeIf(account -> account.getUuid() == uuid);
    }

    @Override
    public Account getAccount(UUID uuid) {
        for (Account account : accounts) {
            if (account.getUuid() == uuid) return account;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}
