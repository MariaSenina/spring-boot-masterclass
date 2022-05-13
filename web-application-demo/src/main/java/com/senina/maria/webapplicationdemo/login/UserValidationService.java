package com.senina.maria.webapplicationdemo.login;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
    public boolean isValidUser(String userName, String password) {
        return userName.equals("Mashimaro") && password.equals("test");
    }
}
