package com.mftplus.simcardmicroservice.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExceptionHandler {

    @Around("execution(* com.mftplus.spring05..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object result = joinPoint.proceed();
            System.out.println("Info : " + result);
            return result;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @After("execution(* com.mftplus.simcardmicroservice..*.*(..))")
    public void drawLine() {
        System.out.println("--------------------------------------------");
    }
}
