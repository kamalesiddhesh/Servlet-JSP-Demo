package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbDemo {

	public static void main(String[] args)  throws Exception{
		String url = "jdbc:mysql://localhost:3306/my";			  
		String user = "root";
		String pass = "password";  
		String query = "select * from login where uname = ? and pass = ?";
		
		Connection con = DriverManager.getConnection(url,user,pass);
	
		PreparedStatement pst =  con.prepareStatement(query);
		pst.setString(1,"siddhesh");
		pst.setString(2,"Abc");
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));							
		}
		con.close();
	}
}
