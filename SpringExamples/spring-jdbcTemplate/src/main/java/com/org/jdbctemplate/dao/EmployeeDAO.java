package com.org.jdbctemplate.dao;

import com.org.jdbctemplate.Employee;

public interface EmployeeDAO {

		public void insert(Employee employee);
		public Employee findById(int id);
}
