package com.java.springframework.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.springframework.di.config.AppConfiguration;
import com.java.springframework.di.field.FieldBasedInjection;
import com.java.springframework.di.xml.Communication1;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		FieldBasedInjection  fieldBasedInjection = applicationContext.getBean(FieldBasedInjection.class);
		fieldBasedInjection.processMsg("twitter message sending ");
		
	
	}
}
