package com.org.simplejdbctemplate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.simplejdbctemplate.dao.impl.EmployeeDAOImpl;

public class App {

	public static void main(String[] args) {

		ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAOImpl dao=(EmployeeDAOImpl)factory.getBean("edao");  
		int status=dao.update(new Employee(2,"Tarun",66));  
		System.out.println(status);  
		factory.close();
	}
}
