package com.lucasjosino.exceptions.account;

public class UnknownAccountException extends AccountException {
    public UnknownAccountException() {
        super();
    }

    public UnknownAccountException(String message) {
        super(message);
    }

    public UnknownAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownAccountException(Throwable cause) {
        super(cause);
    }

    protected UnknownAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
