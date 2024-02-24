package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class GlobalConnection {

	
	static Connection conn = null;
	   public static Connection getConnection() {
	      if (conn != null) return conn;
	      String database = "akirait";
	      String Username = "root";
	      String password = "";
	      return getConnection1(database, Username, password);
	   }
	   private static Connection getConnection1(String databaseName, String UserName, String password) {
	      try {
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost/" + databaseName + "?user=" + UserName + "&password=" + password);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      return conn;
	   }
	
	
}
