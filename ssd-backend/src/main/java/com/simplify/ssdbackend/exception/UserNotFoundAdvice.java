package com.simplify.ssdbackend.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class UserNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> exceptionHandler(UserNotFoundException exception){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("ERROR USER ID NOT FOUND", exception.getMessage());
        return errorMap;
    }
    
}
