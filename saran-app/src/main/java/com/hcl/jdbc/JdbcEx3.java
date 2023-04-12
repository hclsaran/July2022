package com.hcl.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx3 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root","root");
	    CallableStatement cst=con.prepareCall("{call insertEmp(?,?,?)}");
	    cst.setInt(1, 7);
	    cst.setString(2, "Isabel");
	    cst.setInt(3, 25);
	    cst.execute();
	    System.out.println("callablestatement record inserted");
	}

}
