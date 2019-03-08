package com.lkb.micoser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lkb.micoser.POJO.User;
import com.lkb.micoser.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getById(int id) {
		return userMapper.getById(id);
	}

}
