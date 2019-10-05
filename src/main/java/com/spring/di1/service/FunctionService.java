package com.spring.di1.service;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

    public String sayHello(String word) {
        return String.format("hello %s !", word);
    }
}
