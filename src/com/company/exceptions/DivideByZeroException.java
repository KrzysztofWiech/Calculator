package com.company.exceptions;

public class DivideByZeroException extends RuntimeException {

    public DivideByZeroException(String message, Throwable err) {
        super(message, err);
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
