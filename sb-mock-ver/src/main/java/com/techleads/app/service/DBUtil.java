package com.techleads.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con=null;
	static  {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		return con;
	}

}
