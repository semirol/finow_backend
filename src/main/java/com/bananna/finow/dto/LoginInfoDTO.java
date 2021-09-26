package com.bananna.finow.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginInfoDTO {
    //入参
    private Integer phoneNumber;
    private Integer validCode;
    //出参
    private Integer ifLogin;
    private UserDTO user;
}
