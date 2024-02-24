package com.org.jdbctemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.jdbctemplate.dao.EmployeeDAO;
import com.org.jdbctemplate.dao.JDBCEmployeeDAO;

public class App {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
		//insert record
		//Employee employee1 = new Employee(1, "Satyam", 30);
		//employeeDAO.insert(employee1);
		Employee employee2 = employeeDAO.findById(55);
		System.out.println(employee2);	
		    
		JDBCEmployeeDAO jdbcEmployeeDAO = (JDBCEmployeeDAO) context.getBean("jdbcEmployeeDAO");
		Employee employee3 = new Employee(101, "demo", 33);
		jdbcEmployeeDAO.insert(employee3);

		Employee employee4 = jdbcEmployeeDAO.findById(55);
		System.out.println(employee4);	

		List<Employee> employees = jdbcEmployeeDAO.findAll();
		System.out.println(employees.size());	

		System.out.println(" inserted rows: " + employees);

		System.out.println(" FindAll : " + jdbcEmployeeDAO.findAll());
		context.close();
	}
}
