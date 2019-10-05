package com.spring.di2.service;

public class FunctionService {

    public String sayHello(String word) {
        return String.format("this is di2 test, the param value is %s !", word);
    }
}
