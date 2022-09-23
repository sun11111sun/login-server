package com.example.loginserver.service.impl;

import com.example.loginserver.dao.UserloginDaoMapper;
import com.example.loginserver.model.Userlogin;
import com.example.loginserver.param.UserloginReq;
import com.example.loginserver.service.UserloginService;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;


@Service
@Slf4j
public class UserloginServiceImpl implements UserloginService {

    @Resource
    UserloginDaoMapper userloginDaoMapper;

    @Override
    public List<Userlogin> getUserloginList(UserloginReq req) {
        List<Userlogin> list = userloginDaoMapper.selectUserloginList();
        return CollectionUtils.isEmpty(list) ? Lists.newArrayList() : list;
    }

    @Override
    public int deleteByParameterId(UserloginReq req) {
        return userloginDaoMapper.deleteByPrimaryKey(req.getId());
    }

    @Override
    public int insert(UserloginReq req) {
        Userlogin userlogin=new Userlogin();
        userlogin.setLoginName(req.getLoginName());
        userlogin.setPassword(req.getPassword());
        return userloginDaoMapper.insert(userlogin);
    }

    @Override
    public int updateUserlogin(UserloginReq req) {
        Userlogin userlogin=new Userlogin();
        userlogin.setId(req.getId());
        userlogin.setLoginName(req.getLoginName());
        userlogin.setPassword(req.getPassword());
        return userloginDaoMapper.updateByPrimaryKeySelective(userlogin);
    }
}
