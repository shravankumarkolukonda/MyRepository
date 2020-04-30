package com.nit.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleType4DriverExample {

	public static void main(String[] args) throws Exception {
		Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbc", "jdbc");

		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		PreparedStatement pstmt = con.prepareStatement("select * from Employee", ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_READ_ONLY);

		CallableStatement cstmt = con.prepareCall("select * from Employee", ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = stmt.executeQuery("select * from Employee");

		System.out.println("Emp Id:" + "Emp Name" + "Emp Sal");
		System.out.println("====================");

		rs.afterLast();

		while (rs.previous()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
		}
	    
	
	}

}
