package com.zwp;

import com.zwp.beauty.comm.entity.UserInfo;
import com.zwp.beauty.userinfo.dao.IUserInfoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeautyApplicationTests {
	@Autowired
	private IUserInfoDao userInfoDao;
	@Test
	public void contextLoads() {

		List<UserInfo> userInfoList = userInfoDao.selectUserInfoList(1);
		System.out.println(userInfoList);

	}

}
