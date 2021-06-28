package com.bananna.finow.service.impl;

import com.bananna.finow.dto.LoginInfoDTO;
import com.bananna.finow.dto.UserDTO;
import com.bananna.finow.enums.BooleanEnum;
import com.bananna.finow.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public void requestValidCode() {
        System.out.println("requestValidCode");
    }

    @Override
    public LoginInfoDTO login() {
        System.out.println("login");
        UserDTO userDTO = UserDTO.builder().id(1L).name("董善为").build();
        return LoginInfoDTO.builder().user(userDTO).ifLogin(BooleanEnum.TRUE).build();
    }
}
