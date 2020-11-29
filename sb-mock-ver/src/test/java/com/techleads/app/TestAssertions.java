package com.techleads.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAssertions {
	@Test
	public void testA() {
		String expected="hello1";
		String actual="hello";
//		Assertions.assertEquals(expected, actual);
		Assertions.assertEquals(expected, actual, "Please check the expected value!");
	}

}
