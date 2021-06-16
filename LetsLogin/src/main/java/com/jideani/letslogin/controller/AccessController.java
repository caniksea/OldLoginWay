package com.jideani.letslogin.controller;

import com.jideani.letslogin.entity.LoginData;
import com.jideani.letslogin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/letslogin/")
public class AccessController {

    @Autowired private LoginService loginService;

    @PostMapping("login")
    public String login(@RequestBody LoginData loginData) {
        return loginService.login(loginData);
    }
}
