package com.senina.maria.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.senina.maria.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("execution(* com.senina.maria.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("com.senina.maria.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() " +
            "&& com.senina.maria.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution{}")
    public void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    @Pointcut("within(com.senina.maria.spring.aop.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {}
}
