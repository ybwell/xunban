package com.xunban.request;

import lombok.Data;

/**
 * 用户登录
 */
@Data
public class UserLoginRequest {
    private static final long serialVersionUID = 1L;

    private String userAccount;

    private String userPassword;
}
