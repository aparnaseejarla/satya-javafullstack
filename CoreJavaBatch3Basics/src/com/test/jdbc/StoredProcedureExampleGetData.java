package com.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class StoredProcedureExampleGetData {


	public static void main(String[] args) {


		try{
			Connection conn = GlobalConnection.getConnection();
			//Query to call stored procedures
			CallableStatement cstmt = conn.prepareCall("{call GetStudentData()}");
			//Executing the query
			ResultSet rs1 = cstmt.executeQuery();
			//Displaying the result
			System.out.println("Contents of the result-set");
			while(rs1.next()) {
				System.out.print("Student ID: "+rs1.getString("stud_id")+", ");
				System.out.print("Total Marks: "+rs1.getString("total_marks")+", ");
				System.out.print("Gradle of Student : "+rs1.getString("grade")+", ");
				System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}