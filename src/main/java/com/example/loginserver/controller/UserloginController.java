package com.example.loginserver.controller;

import com.example.loginserver.param.UserloginReq;
import com.example.loginserver.service.UserloginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/login")
public class UserloginController {

    @Autowired
    UserloginService userloginService;

    @GetMapping("/getList")
    public Object getList(@RequestBody UserloginReq req) {

        return userloginService.getUserloginList(req);
    }
    @PostMapping("/register")
    public Object register(@RequestBody UserloginReq req) {

        return userloginService.insert(req);
    }

    @PostMapping("/updateUserlogin")
    public Object updateUserlogin(@RequestBody UserloginReq req) {

        return userloginService.updateUserlogin(req);
    }

    @PostMapping("/del")
    public Object del(@RequestBody UserloginReq req) {

        return userloginService.deleteByParameterId(req);
    }
    @GetMapping("/show")
    public Object show() {
        UserloginReq req=new UserloginReq();
        return userloginService.getUserloginList(req);
    }

    @GetMapping("/hello")
    public Object hello() {
        return "hello";
    }



}
