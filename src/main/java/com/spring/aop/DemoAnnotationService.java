package com.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @AopAnnotation(name = "自定义注解AOP拦截")
    public void testAop() {
        System.out.println("this is annotation testAop method !");
    }
}
