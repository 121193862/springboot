package com.spring.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

    public void testAop() {
        System.out.println("this is DemoMethodService -> testAop");
    }
}
