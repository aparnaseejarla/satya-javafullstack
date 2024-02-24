package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataSourceConn {

	public static void main(String[] args) {

		try{  
			String database="student.mdb";//Here database exists in the current directory    
			String url="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + database + ";DriverID=22;READONLY=true";  
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
			Connection c=DriverManager.getConnection(url);  
			Statement st=c.createStatement();  
			ResultSet rs=st.executeQuery("select * from products");  
			while(rs.next()){  
				System.out.println(rs.getString(1));  
			}  
		}catch(Exception ee){System.out.println(ee);}  

	}
}
