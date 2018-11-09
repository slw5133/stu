package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.pojo.User;
import com.tedu.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user) {
		try {
			userService.insert(user);
			return "insert success.";
		}catch(Exception e) {
			e.printStackTrace();
			return "insert error.";
		}
	}
	
}
