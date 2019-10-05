package com.spring.initanddestroy;

/**
 * bean方式init destroy
 */
public class BeanWayService {

    public void initMethod() {
        System.out.println("bean 方式 配置init方法");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化Bean beanWayService");
    }

    public void destriyMethod() {
        System.out.println("bean 方式 destroy");
    }

}
