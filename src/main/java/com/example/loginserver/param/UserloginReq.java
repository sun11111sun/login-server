package com.example.loginserver.param;

import com.example.loginserver.model.Userlogin;
import lombok.Data;


@Data
public class UserloginReq  {

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
}
