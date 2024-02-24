package com.test.multitheading;

public class Message {

	/*
	 * A java bean class on which threads will work and call wait and notify methods.
	 */
	private String msg;

	public Message(String str){
		this.msg=str;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String str) {
		this.msg=str;
	}

}
