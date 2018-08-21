package com.zwp.beauty.userinfo.service.impl;

import com.zwp.beauty.comm.entity.UserInfo;
import com.zwp.beauty.userinfo.dao.IUserInfoDao;
import com.zwp.beauty.userinfo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements IUserInfoService{
    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public List<UserInfo> selectUserInfoList(Integer id) {
        return userInfoDao.selectUserInfoList(id);
    }
}
