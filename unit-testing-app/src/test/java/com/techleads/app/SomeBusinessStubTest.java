package com.techleads.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techleads.app.business.SomeBusinessImpl;
import com.techleads.app.business.SomeDataService;

class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retriveAllData() {
		return new int[] {1,2,3};
	}

	
	
}

class SomeDataServiceOneValStub implements SomeDataService{

	@Override
	public int[] retriveAllData() {
		return new int[] {5};
	}

	
	
}

class SomeDataServiceEmptyStub implements SomeDataService{

	@Override
	public int[] retriveAllData() {
		return new int[] {};
	}

	
	
}
class SomeBusinessStubTest {

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
