package com.spring.di1.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.spring.di1.service")
@Configuration
public class DiConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionServive useFunctionServive = context.getBean(UseFunctionServive.class);
        System.out.println(useFunctionServive.sayHello("aaa"));

    }

}
