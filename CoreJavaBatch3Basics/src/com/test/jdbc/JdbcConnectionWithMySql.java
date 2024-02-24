package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionWithMySql 
{

	public static void main(String[] args) {

		try {
			// hostname ,uname,passowrd ,port no db,db name,driver class
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.88.0.1:3306/akirait", "root", "");

			if (conn != null) {
				System.out.println("mysql Connected succfully!");
			} else {
				System.out.println("mysql db Failed to make connection!");
			}

		} catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
