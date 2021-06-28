package com.bananna.finow.controller;

import com.bananna.finow.dto.LoginInfoDTO;
import com.bananna.finow.external.ApiResp;
import com.bananna.finow.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/requestValidCode")
    public ApiResp requestValidCode(){
        loginService.requestValidCode();
        return ApiResp.success();
    }

    @PostMapping("/login")
    public ApiResp<LoginInfoDTO> login(){
        return ApiResp.success(loginService.login());
    }
}
