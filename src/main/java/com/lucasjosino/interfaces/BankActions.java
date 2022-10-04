package com.lucasjosino.interfaces;

import com.lucasjosino.models.account.Account;

public interface BankActions {
    void createAccount(Account newAccount);
    void deleteAccount(Account newAccount);
    void blockAccount(Account newAccount);
    void getAccount(Account newAccount);
}
