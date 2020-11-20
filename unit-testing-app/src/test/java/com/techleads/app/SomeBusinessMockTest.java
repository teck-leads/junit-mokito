package com.techleads.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.techleads.app.business.SomeBusinessImpl;


class SomeBusinessMockTest {

	@Test
	void calculateSumUsingDataService_basic() {
		SomeBusinessImpl b=new SomeBusinessImpl();
		b.setSomeDataService(new SomeDataServiceStub());
		int actualResult = b.calculateSumUsingDataService();
		int expected=6;
		assertEquals(expected, actualResult);
	}
	
	@Test
	void calculateSum_empty() {
		SomeBusinessImpl b=new SomeBusinessImpl();
		b.setSomeDataService(new SomeDataServiceEmptyStub());
		int actualResult = b.calculateSumUsingDataService();
		int expected=0;
		assertEquals(expected, actualResult);
	}
	
	@Test
	void calculateSum_oneVal() {
		SomeBusinessImpl b=new SomeBusinessImpl();
		b.setSomeDataService(new SomeDataServiceOneValStub());
		int actualResult = b.calculateSumUsingDataService();
		int expected=5;
		assertEquals(expected, actualResult);
	}
	
	

}
