package com.example.loginserver.dao;

import com.example.loginserver.model.Userlogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@ComponentScan
public interface UserloginDaoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userlogin record);

    int insertSelective(Userlogin record);

    Userlogin selectByPrimaryKey(Integer id);
   // @Select("Select   id, login_name as loginName , password from userlogin")
    List<Userlogin> selectUserloginList();

    int updateByPrimaryKeySelective(Userlogin record);

    int updateByPrimaryKey(Userlogin record);
}