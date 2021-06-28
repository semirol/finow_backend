package com.bananna.finow.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginInfoDTO {
    private Integer phoneNumber;
    private Integer validCode;
    private UserDTO user;
    private Integer ifLogin;
}
