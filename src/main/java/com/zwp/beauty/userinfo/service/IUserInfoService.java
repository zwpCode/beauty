package com.zwp.beauty.userinfo.service;

import com.zwp.beauty.comm.entity.UserInfo;

import java.util.List;

public interface IUserInfoService {
    List<UserInfo> selectUserInfoList(Integer id);
}
