package com.shsxt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shsxt.dao.UserDao;
import com.shsxt.model.MessageModel;
import com.shsxt.vo.User;

@Service
public class UserService {
	@Resource	
	private UserDao userDao;

	public synchronized void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void haha(){
		System.out.println("fffffffff");
	}
	public MessageModel check(String name,String pwd){
		MessageModel messageModel = new MessageModel();
		if(null==name || "".equals(name)){
			messageModel.setCode(300);
			messageModel.setMsg("用户名不能为空");
			return messageModel;
		}
		if(null==pwd || "".equals(pwd)){
			messageModel.setCode(300);
			messageModel.setMsg("密码不能为空");
			return messageModel;
		}
		User u=userDao.query(name);
		if(u==null){
			messageModel.setCode(300);
			messageModel.setMsg("用户名错误");
			return messageModel;
		}
		if(!u.getPwd().equals(pwd)){
			messageModel.setCode(300);
			messageModel.setMsg("密码错误");
			return messageModel;
		}
		
		
		return messageModel;
	}
}
