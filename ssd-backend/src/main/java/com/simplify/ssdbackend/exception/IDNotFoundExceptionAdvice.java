package com.simplify.ssdbackend.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class IDNotFoundExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(IDNotFoundException.class)
    public Map<String, String> handleException(IDNotFoundException exception){
        Map<String, String> exceptionMap = new HashMap<String, String>();
        exceptionMap.put("ID NOT FOUND IN DATABASE", exception.getMessage());
        return exceptionMap;
    }
}
