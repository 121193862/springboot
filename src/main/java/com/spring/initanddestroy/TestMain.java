package com.spring.initanddestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.initanddestroy")
public class TestMain {

    @Bean(initMethod = "initMethod", destroyMethod = "destriyMethod")
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestMain.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();

    }
}
