package com.senina.maria.spring.aop.springaop.business;

import com.senina.maria.spring.aop.springaop.data.DaoTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessTwo {
    @Autowired
    private DaoTwo daoTwo;

    public String calculateSomething() {
        // Some business logic here...

        return daoTwo.retrieveSomething();
    }
}
