package com.zkr.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zkr.spring.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public void get(){
		userService.saveUser();
	}
}	
