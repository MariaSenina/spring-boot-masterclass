package com.senina.maria.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.senina.maria.spring.aop.springaop.business.*.*(..))")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable {
        // startTime = x;
        long startTime = System.currentTimeMillis();
        // allow execution of method
        joinPoint.proceed();
        // endTime - startTime;
        long timeTaken = System.currentTimeMillis() - startTime;

        logger.info("Time taken by {} is {}", joinPoint, timeTaken);
    }
}
