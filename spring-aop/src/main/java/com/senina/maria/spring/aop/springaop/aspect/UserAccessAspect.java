package com.senina.maria.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    // What do we want to intercept?
    // execution(* PACKAGE.*.*(..))
    @Before("com.senina.maria.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void before(JoinPoint joinPoint) {
        logger.info("Checking user access level");
        logger.info("Allowed {}", joinPoint);
    }
}
