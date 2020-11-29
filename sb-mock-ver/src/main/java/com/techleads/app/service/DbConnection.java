package com.techleads.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	
	public Connection getConn() throws SQLException {
		Connection con=null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		}
		 catch (SQLException e) {
			throw e;
		}
		return con;
		
		
	}

}
