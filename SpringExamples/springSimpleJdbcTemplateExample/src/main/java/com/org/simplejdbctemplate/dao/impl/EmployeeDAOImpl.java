package com.org.simplejdbctemplate.dao.impl;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.org.simplejdbctemplate.Employee;
import com.org.simplejdbctemplate.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO
{

	@SuppressWarnings("deprecation")
	public SimpleJdbcTemplate template;  

	@SuppressWarnings("deprecation")
	public EmployeeDAOImpl(SimpleJdbcTemplate template) {  
		this.template = template;  
	}  


	public int update(Employee e) {

		String query="update employeedemo set name=? where id=?";  
		return template.update(query,e.getName(),e.getId());  

		//String query="update employee set name=?,salary=? where id=?";  
		//return template.update(query,e.getName(),e.getSalary(),e.getId());  
	}
}