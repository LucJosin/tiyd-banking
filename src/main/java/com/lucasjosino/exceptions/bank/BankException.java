package com.lucasjosino.exceptions.bank;

public class BankException extends Exception {
    public BankException() {
        super();
    }

    public BankException(String message) {
        super(message);
    }

    public BankException(String message, Throwable cause) {
        super(message, cause);
    }

    public BankException(Throwable cause) {
        super(cause);
    }

    protected BankException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
