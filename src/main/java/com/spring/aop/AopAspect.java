package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class AopAspect {

    @Pointcut("@annotation(com.spring.aop.AopAnnotation)")
    public void aopAnnotationPointCut() {
    }

    @After("aopAnnotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        AopAnnotation aopAnnotation = method.getAnnotation(AopAnnotation.class);
        System.out.println("被拦截方法上的注解name值是:" + aopAnnotation.name());
    }

    @Before("execution(* com.spring.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法拦截被拦截的方法名是: " + method.getName());
    }

}
