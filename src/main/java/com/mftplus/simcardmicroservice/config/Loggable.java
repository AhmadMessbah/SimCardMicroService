package com.mftplus.simcardmicroservice.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.dao.PermissionDeniedDataAccessException;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class Loggable {
//    @Before("execution(* com.mftplus.spring05..*.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        authentication.getAuthorities()
//        if (! user.role.permissions.contains("Save")){
//            throw new PermissionDeniedDataAccessException();
//        }
//    }

//    @Around("execution(* com.mftplus.spring05..*.*(..))")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
////        log.info();
//        System.out.println("+ Run : " + joinPoint.getSignature().getName());
//        System.out.println("\t" + "Arguments");
//        for (Object arg : joinPoint.getArgs()) {
//            System.out.println("\t" + arg);
//        }
//
//        Object result = joinPoint.proceed();
//        System.out.println("- Done " + joinPoint.getSignature().getName());
//        return result;
//    }
//
//    @After("execution(* com.mftplus.spring05..*.*(..))")
//    public void drawLine() {
//        System.out.println("--------------------------------------------");
//    }
}
