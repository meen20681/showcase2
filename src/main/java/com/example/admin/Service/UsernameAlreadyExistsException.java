package com.example.admin.Service;

public class UsernameAlreadyExistsException extends Throwable {
    public UsernameAlreadyExistsException(String message) {
        super(message);
    }
}
