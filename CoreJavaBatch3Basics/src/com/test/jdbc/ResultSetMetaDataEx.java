package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class ResultSetMetaDataEx {


	public static void main(String[] args) {
		try{
			Connection conn = GlobalConnection.getConnection();
			PreparedStatement stmt=conn.prepareStatement("select *from products");  
			ResultSet rs=stmt.executeQuery();  
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1)); 
			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getColumnLabel(3));
			conn.close();  
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
