package com.lucasjosino.interfaces;

import com.lucasjosino.models.account.Account;

public interface AccountActions {
    void transfer(Account to, double amount);
    void withdraw(double amount);
    void deposit(double amount);
}
