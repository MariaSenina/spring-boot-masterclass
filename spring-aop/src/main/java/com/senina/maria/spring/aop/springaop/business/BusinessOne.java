package com.senina.maria.spring.aop.springaop.business;

import com.senina.maria.spring.aop.springaop.data.DaoOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessOne {
    @Autowired
    private DaoOne daoOne;

    public String calculateSomething() {
        // Some business logic here...

        return daoOne.retrieveSomething();
    }
}
