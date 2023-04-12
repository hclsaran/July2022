package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","root");
	   /* PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
	    pst.setInt(1, 6);//1 refers the first parameter
	    pst.setString(2, "Hadiqa");
	    pst.setInt(3,24);
	    
	    
	    int x=pst.executeUpdate();
	    System.out.println(x +"record(s) inserted");
	    */
		
		/*PreparedStatement pst=con.prepareStatement("update emp set name=? where id=?");
	    pst.setString(1, "Blaise");//1 refers the first parameter
	    pst.setInt(2,4);
	    int x=pst.executeUpdate();
	    System.out.println(x +"record(s) updated");
	    */
		
		/*PreparedStatement pst=con.prepareStatement("delete from emp where id=?");
	    
	    pst.setInt(1,5);
	    int x=pst.executeUpdate();
	    System.out.println(x +"record(s) deleted");*/
	    
	    
	    PreparedStatement pst=con.prepareStatement("select * from emp");
	    ResultSet rs=pst.executeQuery();
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt("age"));
	    }
	    
	    
	    
	}

}
