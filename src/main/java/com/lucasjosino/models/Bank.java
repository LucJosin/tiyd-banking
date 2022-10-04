package com.lucasjosino.models;

import com.lucasjosino.interfaces.BankActions;
import com.lucasjosino.models.account.Account;

import java.util.UUID;

public class Bank implements BankActions {
    private UUID uuid;
    private String name;
    private int code;
    private String phoneNumber;
    private Address address;

    @Override
    public void createAccount(Account newAccount) {

    }

    @Override
    public void deleteAccount(Account newAccount) {

    }

    @Override
    public void blockAccount(Account newAccount) {

    }

    @Override
    public void getAccount(Account newAccount) {

    }
}
