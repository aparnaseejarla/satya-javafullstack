package com.test.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteTheMultipleInserts {

	public static void main(String[] args) {
		try{
			Connection conn = GlobalConnection.getConnection();
			Statement stmt = conn.createStatement();
			System.out.println("Inserting records into the table...");          
			String sql1 = "INSERT INTO products VALUES (899,'Cloths','TV',22)";
			String sql2 = "INSERT INTO products VALUES (898,'Mobiles','SmartPhone',88)";
			String sql3 = "INSERT INTO products VALUES (3883,'Mobiles','SmartPhone',99)";
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.executeBatch();		    
			ResultSet rs = stmt.executeQuery("Select * from products");
			System.out.println(
					"Product ID\tCategory\t\tProduct Name");
			System.out.println(
					"-------------------------------------------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t\t"
						+ rs.getString(2)
						+ "\t\t"
						+ rs.getString(3));
			}
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

