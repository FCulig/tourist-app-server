package com.fifi.technologies.tourist.exception;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String errorMessage) {
        super(errorMessage);
    }
}
