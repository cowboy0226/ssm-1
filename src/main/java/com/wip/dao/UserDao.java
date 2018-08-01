package com.wip.dao;

import com.wip.model.UserDomain;


public interface UserDao {
	
	UserDomain findUserById(Integer id);
}
