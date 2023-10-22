package com.example.aop.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@Order(value=1)
public class LogPrinterAop {

    @Pointcut("execution(* com.example.aop.controller.AopTestController.*(..))")
    public void enableLogPrinter(){}

    @Before("enableLogPrinter()")
    public void logPinter(JoinPoint jp){
        log.debug("Signature: {}, Args: {}", jp.getSignature(), jp.getArgs());
    }
}
