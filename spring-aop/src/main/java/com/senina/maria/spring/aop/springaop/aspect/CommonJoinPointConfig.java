package com.senina.maria.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.senina.maria.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {}
}
