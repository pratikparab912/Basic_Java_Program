package com.study;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String invalidAge) {
        super(invalidAge);
    }
}
