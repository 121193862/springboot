package com.spring.initanddestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * jsr250方式 init destroy
 */
public class JSR250WayService {

    @PostConstruct
    public void initMehtod() {
        System.out.println("jsr250 方式 init 方法");
    }

    public JSR250WayService() {
        super();
        System.out.println("jsr250WayService 初始化");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("jsr230 方式 destroy 方法");
    }

}
