package com.thuan.auth.api.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LoginResponse {
    String message;
    Boolean status;
    public LoginResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }
}
