package com.nit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementEx {

	public static void main(String[] args) throws Exception {
	//	Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbc", "jdbc");

		String sql = "insert into Employee values(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement("select * from Employee");
		
        ResultSet rs=pstmt.executeQuery();
        
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3)+", "+rs.getDate(4));
        }
		
		
		pstmt.close();
		con.close();
	}

}
