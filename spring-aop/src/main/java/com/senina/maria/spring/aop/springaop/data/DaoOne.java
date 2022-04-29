package com.senina.maria.spring.aop.springaop.data;

import com.senina.maria.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DaoOne {
    @TrackTime
    public String retrieveSomething() {
        return "DAO 1";
    }
}
