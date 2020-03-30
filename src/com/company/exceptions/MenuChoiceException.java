package com.company.exceptions;

public class MenuChoiceException extends RuntimeException {

    public MenuChoiceException(String message, Throwable err) {
        super(message, err);
    }

    public MenuChoiceException(String message) {
        super(message);
    }
}
