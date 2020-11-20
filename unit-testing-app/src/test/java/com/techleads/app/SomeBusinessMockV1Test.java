package com.techleads.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techleads.app.business.SomeBusinessImpl;
import com.techleads.app.business.SomeDataService;

class SomeBusinessMockV1Test {

	SomeBusinessImpl business = new SomeBusinessImpl();
	SomeDataService mockService = mock(SomeDataService.class);

	@BeforeEach
	public void before() {
		business.setSomeDataService(mockService);
	}

	@Test
	void calculateSumUsingDataService_basic() {
		when(mockService.retriveAllData()).thenReturn(new int[] { 1, 2, 3 });
		int actual = business.calculateSumUsingDataService();
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	void calculateSum_empty() {

		when(mockService.retriveAllData()).thenReturn(new int[] {});

		int actualResult = business.calculateSumUsingDataService();
		int expected = 0;
		assertEquals(expected, actualResult);
	}

	@Test
	void calculateSum_oneVal() {
		when(mockService.retriveAllData()).thenReturn(new int[] { 5 });
		int actualResult = business.calculateSumUsingDataService();
		int expected = 5;
		assertEquals(expected, actualResult);
	}

}
