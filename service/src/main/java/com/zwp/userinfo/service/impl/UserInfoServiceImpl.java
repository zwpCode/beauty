package com.zwp.userinfo.service.impl;

import com.zwp.model.entity.UserInfo;
import com.zwp.userinfo.service.IUserInfoService;
import com.zwp.userinfo.dao.IUserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public List<UserInfo> selectUserInfoList(Integer id) {
        return userInfoDao.selectUserInfoList(id);
    }
}
