package com.senina.maria.webapplicationdemo;

public class UserValidationService {
    public boolean isValidUser(String userName, String password) {
        return userName.equals("Mashimaro") && password.equals("test");
    }
}
