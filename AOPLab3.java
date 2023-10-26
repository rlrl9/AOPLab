package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AOPLab3 {
    @Around("within(com.example.springedu.controller.EmpController)")
    public void around(ProceedingJoinPoint pjp) throws Throwable
    {
        long startTime = System.currentTimeMillis();
        try {
            pjp.proceed();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        log.info("[LOG]-수행시간 {} 밀리초 +++++++",timeElapsed);
    }
}
