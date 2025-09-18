package com.wipro.bank.exception;

public class BankValidationException extends Exception {
    public BankValidationException(String message) {
        super(message); // calls Exception(String message) constructor
    }
}