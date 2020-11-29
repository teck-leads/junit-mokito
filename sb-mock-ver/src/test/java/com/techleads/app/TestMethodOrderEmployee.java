package com.techleads.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Test Employee OP")
public class TestMethodOrderEmployee {
	
	
	@BeforeAll
	public static void setupOneTime() {
		System.out.println("Executes only time for all testcase");
		System.out.println();
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("Executes before each testcase");
	}

	@DisplayName(value = "Test Retrive")
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
	@Tag(value = "DEV")
	public void testUpdate() {
		System.out.println("testUpdate()");
	}
	@Test
	@Order(4)
	@Disabled
	public void testDelete() {
		System.out.println("testDelete()");
	}
	@AfterEach
	public void clear() {
		System.out.println("Executes after each test case");
		System.out.println();
	}
	

	@RepeatedTest(value = 3, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
	@DisplayName(value = "TestMultiple")
	@Order(5)
	public void testMultiple(TestInfo info) {
		System.out.println("multiple "+info.getDisplayName());
	}
	
	@AfterAll
	public static void setupAfterAll() {
		System.out.println("Executes only time after all testcase");
	}
}
