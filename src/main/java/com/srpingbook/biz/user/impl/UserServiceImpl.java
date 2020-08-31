package com.srpingbook.biz.user.impl;

import com.srpingbook.biz.user.UserService;
import com.srpingbook.biz.user.UserVO;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	

}
