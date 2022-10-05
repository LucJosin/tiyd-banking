package com.lucasjosino.interfaces;

import com.lucasjosino.enums.AccountType;
import com.lucasjosino.models.account.Account;

import java.util.UUID;

public interface BankActions {
    Account createAccount(String ownerName, AccountType type);
    void deleteAccount(UUID uuid);
    Account getAccount(UUID uuid);
}
