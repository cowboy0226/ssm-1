package com.wip.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wip.dao.UserDao;
import com.wip.model.UserDomain;
import com.wip.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public UserDomain findUserById(Integer id) {
		return userDao.findUserById(id);
	}

}
