package com.example.loginserver.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * userlogin
 * @author 
 */
@Data
public class Userlogin implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 登录名字
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;
    private Date createTime;

    private Date updateTime;
    private static final long serialVersionUID = 1L;
}