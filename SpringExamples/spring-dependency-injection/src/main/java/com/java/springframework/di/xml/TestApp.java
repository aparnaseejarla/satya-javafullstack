package com.java.springframework.di.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String args[]){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Communication app = (Communication)context.getBean("communication");
		app.communicate();
		
		
		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		Communication1 app1 = (Communication1)context1.getBean("communication1");
		//app1.communicate1();
	}
	
	
}
