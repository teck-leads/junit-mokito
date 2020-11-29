package com.techleads.app.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class DBUtilTest {

	@Test
	void testGetConn() {
		Connection conn1 = DBUtil.getConn();
		Connection conn2 = DBUtil.getConn();

		if (conn1 == null || conn2 == null) {
			fail("Connection not created");
		}
		assertSame(conn1, conn2);
	}

}
