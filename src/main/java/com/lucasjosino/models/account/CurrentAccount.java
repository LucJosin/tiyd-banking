package com.lucasjosino.models.account;

import com.lucasjosino.enums.AccountStatus;
import com.lucasjosino.models.Bank;

import java.util.Random;
import java.util.UUID;

public class CurrentAccount extends Account {

    public CurrentAccount(String ownerName, Bank bank) {
        Random random = new Random();
        super.uuid = UUID.randomUUID();
        super.balance = 0.0;
        super.code = random.nextInt(999);
        super.number = String.valueOf(random.nextInt(10000) + random.nextInt(10000));
        super.ownerName = ownerName;
        super.limit = 1000;
        super.status = AccountStatus.ACTIVE;
        super.bank = bank;
    }

    @Override
    public UUID getUuid() {
        return super.getUuid();
    }

    @Override
    public String getOwnerName() {
        return super.getOwnerName();
    }

    @Override
    public String getNumber() {
        return super.getNumber();
    }

    @Override
    public int getCode() {
        return super.getCode();
    }

    @Override
    public Bank getBank() {
        return super.getBank();
    }

    @Override
    public double getLimit() {
        return super.getLimit();
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public AccountStatus getStatus() {
        return super.getStatus();
    }

    @Override
    public void transfer(Account to, double amount) {
        super.balance = getBalance() - amount;
        to.balance = to.getBalance() + amount;
    }

    @Override
    public void withdraw(double amount) {
        super.balance = getBalance() - amount;
    }

    @Override
    public void deposit(double amount) {
        super.balance = getBalance() + amount;
    }
}
