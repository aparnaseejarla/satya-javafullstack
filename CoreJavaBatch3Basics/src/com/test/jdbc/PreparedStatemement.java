package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PreparedStatemement {


	public static void main(String[] args) {

		try{
			Connection conn = GlobalConnection.getConnection();
			PreparedStatement stmt=conn.prepareStatement("insert into products values(?,?,?,?)");  
			stmt.setInt(1,228);
			stmt.setString(2,"Testing111");
			stmt.setString(3,"Testing111");
			stmt.setInt(4,3333);
			int i = stmt.executeUpdate();
			System.out.println(i+"�records�inserted");

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
