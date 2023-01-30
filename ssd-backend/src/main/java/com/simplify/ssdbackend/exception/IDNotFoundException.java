package com.simplify.ssdbackend.exception;

public class IDNotFoundException extends RuntimeException{
    public IDNotFoundException(Long id){
        super("Data not found for given ID: " + id);
    }   
}
