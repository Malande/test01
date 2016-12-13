package com.shsxt.dao;

import org.springframework.stereotype.Repository;

import com.shsxt.vo.User;

@Repository
public class UserDao {
	private final String NAME="admin";
	private final String PWD="admin";
	
	
	public User query(String name){
		if(!this.NAME.equals(name)){
			return null;
		}
		
		return new User(NAME,PWD);
	}
}
