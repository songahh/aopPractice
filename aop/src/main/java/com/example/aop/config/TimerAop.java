package com.example.aop.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Component
@Slf4j
public class TimerAop {

    @Pointcut("@annotation(com.example.aop.config.Timer)")
    private void enableTimer(){}

    @Around("enableTimer()")
    public Object measureTime(ProceedingJoinPoint jp) throws Throwable{
        long startTime = System.currentTimeMillis();
        log.debug("Signature: {}, Args: {}", jp.getSignature(), jp.getArgs());

        Object result = jp.proceed();

        long endTime = System.currentTimeMillis();
        long time = TimeUnit.MILLISECONDS.toSeconds(endTime-startTime);
        log.debug("실행시간: {}s", time);
        return result;
    }
}

