package com.lucasjosino.exceptions.bank;

public class UnknownBankException extends BankException {
    public UnknownBankException() {
        super();
    }

    public UnknownBankException(String message) {
        super(message);
    }

    public UnknownBankException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownBankException(Throwable cause) {
        super(cause);
    }

    protected UnknownBankException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
