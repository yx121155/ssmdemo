package com.one.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.mapper.UserMapper;
import com.one.pojo.User;
import com.one.service.userService;

@Service
public class UserServiceImp implements userService{
	@Autowired
     private UserMapper userMapper;
	public List<User> selectAll() {
		
		return userMapper.selectAll();
	}

}
