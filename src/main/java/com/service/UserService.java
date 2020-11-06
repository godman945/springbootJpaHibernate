package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IUserDAO;
import com.entity.User;

@Service
public class UserService {

	@Autowired
    private IUserDAO userDao;

	public List<User> getAllUsers(){
		 return userDao.getAllUsers();
	}
}
