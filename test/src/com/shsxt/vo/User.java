package com.shsxt.vo;

public class User {
	private String name;
	private String pwd;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized String getPwd() {
		return pwd;
	}
	public synchronized void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	
	
}
