package com.techleads.app;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {

	@Test
	@Order(1)
	public void testRetrieve() {
		System.out.println("testRetrieve()");
	}
	@Test
	@Order(2)
	public void testSave() {
		System.out.println("testSave()");
	}
	@Test
	@Order(3)
	public void testUpdate() {
		System.out.println("testUpdate()");
	}
	@Test
	@Order(4)
	public void testDelete() {
		System.out.println("testDelete()");
	}
}
