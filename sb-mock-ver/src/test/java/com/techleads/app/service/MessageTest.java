package com.techleads.app.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessageTest {
	
	private Message m=null;
	private String exprected;
	private String actual;
	@BeforeEach
	public void setup() {
		m=new Message();
		exprected = "Welcome madhav";
	
	}

	@Test
	void testShowMessage() {
		actual=m.showMsg("madhav");
		assertEquals(exprected, actual);
		
	}
	@AfterEach
	public void clean() {
		m=null;
		exprected=null;
	}

}
