package com.zwp.userinfo.controller;

import com.zwp.model.entity.UserInfo;
import com.zwp.userinfo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping(value = "/selectUserInfoList")
    public List<UserInfo> selectUserInfoList(Integer id){
        return userInfoService.selectUserInfoList(id);
    }

}
