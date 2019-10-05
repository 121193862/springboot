package com.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.scope")
public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestMain.class);
        SingletonService singletonService1 = context.getBean(SingletonService.class);
        SingletonService singletonService2 = context.getBean(SingletonService.class);
        System.out.println("scope->singleton 多对象是否为同一个:" + singletonService1.equals(singletonService2));

        PrototypeService prototypeService1 = context.getBean(PrototypeService.class);
        PrototypeService prototypeService2 = context.getBean(PrototypeService.class);
        System.out.println("scope->prototype 多对象是否为同一个：" + prototypeService1.equals(prototypeService2));
    }
}
