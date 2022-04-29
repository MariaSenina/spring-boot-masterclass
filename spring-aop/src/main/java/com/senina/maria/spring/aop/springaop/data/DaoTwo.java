package com.senina.maria.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DaoTwo {
    public String retrieveSomething() {
        return "DAO 2";
    }
}
