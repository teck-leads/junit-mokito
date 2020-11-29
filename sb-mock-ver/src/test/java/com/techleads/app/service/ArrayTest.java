package com.techleads.app.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void testArrays() {
		int[] a1= {1,2,3,3};
		int[] a2= {1,2,3,3};
		assertArrayEquals(a1, a2);
	}

}
