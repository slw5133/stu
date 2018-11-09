package com.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tedu.pojo.User;

public interface UserMapper {

	//查询
	@Select("select id,name,birthday,address from user")
	public List<User> findAll();
	
	//新增
	@Select("insert into user "
			+ "(name,birthday,address)"
			+ " values(#{user.name},#{user.birthday},#{user.address})")
	public void insert(@Param("user") User user);

}
