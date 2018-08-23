package com.zwp.userinfo.service;

import com.zwp.model.entity.UserInfo;

import java.util.List;

public interface IUserInfoService {
    List<UserInfo> selectUserInfoList(Integer id);
}
