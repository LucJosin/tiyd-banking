package com.lucasjosino.models;

import com.lucasjosino.models.account.CurrentAccount;
import com.lucasjosino.models.account.SavingsAccount;

import java.util.UUID;

public class Client {
    private UUID uuid;
    private String name;
    private int age;
    private int phone;
    private Address address;
    private SavingsAccount savingsAccount;
    private CurrentAccount currentAccount;
}
