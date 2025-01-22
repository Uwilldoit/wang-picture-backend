package com.wang.wangpicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * creator: Shajia Wang
 * createTime:2025/1/21---16:16
 * description:
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}

