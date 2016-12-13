package com.shsxt.model;

public class MessageModel {
	private String msg="chenggong";
	private int code=200;
	public synchronized String getMsg() {
		return msg;
	}
	public synchronized void setMsg(String msg) {
		this.msg = msg;
	}
	public synchronized int getCode() {
		return code;
	}
	public synchronized void setCode(int code) {
		this.code = code;
	}
	
}
