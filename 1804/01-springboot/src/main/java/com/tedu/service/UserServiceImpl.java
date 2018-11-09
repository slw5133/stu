package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	//查询所有
	public List<User> findAll(){
		return userMapper.findAll();
		
	}
	//新增
	@Override
	public void insert(User user) {
		 userMapper.insert(user);
	}
}
