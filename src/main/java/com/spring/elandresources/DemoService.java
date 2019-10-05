package com.spring.elandresources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class DemoService {

    @Value("demoService->testValue")
    public String testValue;

}
