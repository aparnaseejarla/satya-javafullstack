package com.test.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class DatabaseMetaDataExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{  
			Connection conn = GlobalConnection.getConnection();
			DatabaseMetaData dbmd=conn.getMetaData();   
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion()); 
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.println(dbmd.getMaxColumnNameLength());
			conn.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  

}
