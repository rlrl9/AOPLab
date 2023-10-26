package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AOPLab1 {
    @Before("execution(* com.example.springedu.controller.HelloController.hello(..))")
    public void b() {
        log.info("[AOP] hello 수행 전 =======");
    }
    @After("execution(* com.example.springedu.controller.HelloController.hello(..))")
    public void a() {
        log.info("[AOP] hello 수행 후 =======");
    }
}
