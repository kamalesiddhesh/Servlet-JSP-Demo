package com.login;
import java.sql.*;

public class LoginDao {
	
	
	String url = "jdbc:mysql://localhost:3306/my";			  
	String user = "root";
	String pass = "password";  
	public boolean check(String uname,String password) throws Exception{
			String query = "select * from login where uname = ? and pass = ?";
//			String q = String.format("select * from login where uname='%s' and pass = '%s'",uname,password);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
				
			PreparedStatement pst =  con.prepareStatement(query);
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(q);
			pst.setString(1,uname);
			pst.setString(2,password);
			ResultSet rs = pst.executeQuery();
			
			System.out.println("t1");
			
			while(rs.next()) {
				System.out.println("t2");
				return true;				
			}

		
		return false;
	}
}
