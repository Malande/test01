package com.shsxt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.shsxt.model.MessageModel;
import com.shsxt.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	public MessageModel login(String name,String pwd){
	MessageModel messageModel = new MessageModel();
	
	 messageModel = userService.check(name, pwd);
	
	return messageModel;
		
		
		
	}
}
