package com.spring.aware;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.aware")
public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestMain.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.putPrint();
        context.close();
    }
}
