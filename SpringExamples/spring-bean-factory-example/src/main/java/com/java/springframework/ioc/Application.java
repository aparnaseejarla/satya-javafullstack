package com.java.springframework.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
	public static void main(String[] args) {
		
		//Loading xml with bean factory
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("applicationContext.xml"));
	
	
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();

		//Loading xml with bean factory
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld obj1 = (HelloWorld) bf.getBean("helloWorld");
		obj1.getMessage();
	}
}
