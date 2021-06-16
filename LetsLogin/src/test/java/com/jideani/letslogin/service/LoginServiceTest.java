package com.jideani.letslogin.service;

import com.jideani.letslogin.entity.LoginData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoginServiceTest {

    @Autowired private LoginService service;

    @Test void login() {
        LoginData loginData = new LoginData("akpororo", "password");
        String retdata = service.login(loginData);
    }
}