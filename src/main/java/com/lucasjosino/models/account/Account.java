package com.lucasjosino.models.account;

import com.lucasjosino.enums.AccountStatus;
import com.lucasjosino.interfaces.AccountActions;
import com.lucasjosino.models.Bank;

import java.util.UUID;

abstract public class Account implements AccountActions {
    private UUID uuid;
    private String ownerName;
    private String number;
    private int code;
    private Bank bank;
    private double limit;
    private double balance;
    private AccountStatus status;
}
