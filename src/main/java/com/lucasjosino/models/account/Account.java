package com.lucasjosino.models.account;

import com.lucasjosino.enums.AccountStatus;
import com.lucasjosino.interfaces.AccountActions;
import com.lucasjosino.models.Bank;

import java.util.UUID;

abstract public class Account implements AccountActions {
    protected UUID uuid;
    protected String ownerName;
    protected String number;
    protected int code;
    protected Bank bank;
    protected double limit;
    protected double balance;
    protected AccountStatus status;

    public UUID getUuid() {
        return uuid;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getNumber() {
        return number;
    }

    public int getCode() {
        return code;
    }

    public Bank getBank() {
        return bank;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uuid=" + uuid +
                ", ownerName='" + ownerName + '\'' +
                ", number='" + number + '\'' +
                ", code=" + code +
                ", bank=" + bank +
                ", limit=" + limit +
                ", balance=" + balance +
                ", status=" + status +
                '}';
    }
}
