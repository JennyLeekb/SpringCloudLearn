package com.lkb.micoser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lkb.micoser.POJO.User;
import com.lkb.micoser.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	/**
	 * 根据 id 获取用户
	 * @param id
	 * @return
	 */
	@RequestMapping("user/getById")
	public User getById(int id) {
		return userService.getById(id);
	}
}
