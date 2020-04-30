package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlType4DriverExample {

	public static void main(String[] args) throws Exception {
		Class clz = Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		Statement pstmt = con.prepareStatement("select * from Employee", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		Statement cstmt = con.prepareCall("select * from Employee", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		ResultSet rs = stmt.executeQuery("select * from Employee");
		
		System.out.println("Emp Id:"+"Emp Name"+"Emp Sal");
		System.out.println("====================");
		
		rs.afterLast();
		
		while (rs.previous()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
     
		
	}

}
