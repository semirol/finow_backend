package com.bananna.finow.service;

import com.bananna.finow.dto.LoginInfoDTO;

public interface LoginService {
    void requestValidCode();
    LoginInfoDTO login();
}
