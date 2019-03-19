package com.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.one.pojo.User;
import com.one.service.userService;

@Controller
public class UserController {
	@Autowired
	private userService userService;
	@RequestMapping("app")
	public String index() {
		List<User>	users=userService.selectAll();
		for (User user : users) {
			System.out.println("user="+user.getPassword());
		}
		return "index";
	}
}
