package com.shsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.controller.UserController;
import com.shsxt.model.MessageModel;

public class Test {

	@org.junit.Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserController u=(UserController) ac.getBean("userController");
		MessageModel login = u.login("admin", "admin");
		
		System.out.println(login.getMsg()+"  "+login.getCode());
	}
	

}
