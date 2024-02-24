package com.java.springframework.di.xml;

public class Communication1 {

	private Encryption encryption;

	/*
	 * DI via Constructor Injection
	 */
	public Communication1(Encryption encryption){
		this.encryption = encryption;
	}


	public void communicate1(){
		encryption.encryptData();
	}
}
