package com.example.loginserver.service;


import com.example.loginserver.model.Userlogin;
import com.example.loginserver.param.UserloginReq;

import java.util.List;

public interface UserloginService {

    List<Userlogin> getUserloginList(UserloginReq req);

    int deleteByParameterId(UserloginReq req);

    int insert(UserloginReq req);
    int updateUserlogin(UserloginReq req);


}
