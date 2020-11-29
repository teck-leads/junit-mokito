package com.techleads.app.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DbConnectionTest {
	
	DbConnection dbc=null;
	Connection conn=null;
	@BeforeEach
	public void setup() {
		dbc=new DbConnection();
	}
	

	@Test
	void testGetConn() {
		assertDoesNotThrow(()->{conn=dbc.getConn();});
		assertNotNull(conn);
	}
	
	@AfterEach
	public void clean() {
		dbc=null;
		conn=null;
	}

}
