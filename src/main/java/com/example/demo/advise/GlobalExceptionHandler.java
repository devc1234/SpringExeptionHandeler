package com.example.demo.advise;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exeption.UserNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> handleUserException(UserNotFoundException exception){

        Map<String,String >  errorMap = new HashMap<>();
         errorMap.put("error message is ", exception.getMessage());
         return errorMap;
    }
}