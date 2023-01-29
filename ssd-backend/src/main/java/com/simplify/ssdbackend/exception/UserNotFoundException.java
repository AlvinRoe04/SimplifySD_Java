package com.simplify.ssdbackend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User ID: " + id + " not found. Are you sure you have the right ID?");
    }
    
}
