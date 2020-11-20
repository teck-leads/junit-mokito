package com.techleads.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techleads.app.business.SomeBusinessImpl;

class SomeBusinessTest {

	@Test
	void calculateSum_basic() {
		SomeBusinessImpl b=new SomeBusinessImpl();
		int actualResult = b.calculateSum(new int[] {1,2,3});
		int expected=6;
		assertEquals(expected, actualResult);
	}
	
	@Test
	void calculateSum_empty() {
		SomeBusinessImpl b=new SomeBusinessImpl();
		int actualResult = b.calculateSum(new int[] {});
		int expected=0;
		assertEquals(expected, actualResult);
	}
	
	@Test
	void calculateSum_oneValue() {
		SomeBusinessImpl b=new SomeBusinessImpl();
		int actualResult = b.calculateSum(new int[] {5});
		int expected=5;
		assertEquals(expected, actualResult);
	}

}
