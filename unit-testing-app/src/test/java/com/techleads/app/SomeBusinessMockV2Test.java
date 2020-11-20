package com.techleads.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.techleads.app.business.SomeBusinessImpl;
import com.techleads.app.business.SomeDataService;
@ExtendWith(MockitoExtension.class)
class SomeBusinessMockV2Test {

	@InjectMocks
	SomeBusinessImpl business;
	@Mock
	SomeDataService mockService;

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
