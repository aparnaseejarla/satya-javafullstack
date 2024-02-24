package com.test.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {

		try{
            Connection con = GlobalConnection.getConnection();
			Statement stmt = con.createStatement();
			String createSqltable = "CREATE TABLE products " +
	                   "(id INTEGER not NULL, " +
	                   " pname VARCHAR(255), " + 
	                   " category VARCHAR(255), " + 
	                   " price INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	        // stmt.executeUpdate(createSqltable);
			
			System.out.println("Inserting records into the table...");    
			String sql1 = "INSERT INTO products VALUES (888,'Cloths.','TV',22)";
		     stmt.execute(sql1);

			// stmt.executeBatch();		    
		    ResultSet rs = stmt.executeQuery("Select * from products");
        System.out.println(
            "Product ID\tPname\t\tCategory");
        System.out.println(
            "-------------------------------------------------------");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "\t\t"
                               + rs.getString(2)
                               + "\t\t"
                               + rs.getString(3));
        }
        //con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
