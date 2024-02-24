package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {


	public static void main(String[] args) {
		try{
			
			Connection conn = DriverManager.getConnection(Constants.DB_URL,Constants.USER,Constants.PASS);
			
			Statement stmt = conn.createStatement();	      
			String sql = "CREATE DATABASE IBM";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");   	  
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
