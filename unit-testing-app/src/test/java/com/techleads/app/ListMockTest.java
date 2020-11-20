package com.techleads.app;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class ListMockTest {

	List<String> mock = mock(List.class);

	@Test
	void size_basic() {
		when(mock.size()).thenReturn(5);
		assertEquals(5, mock.size());
	}

	@Test
	void returnDifferentValues() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
	}

	@Test
	void returnWithParams() {
		when(mock.get(0)).thenReturn("mocktest");
		assertEquals("mocktest", mock.get(0));
		assertEquals(null, mock.get(1));
	}

	@Test
	void returnWithGenericParams() {
		when(mock.get(anyInt())).thenReturn("mocktest");
		assertEquals("mocktest", mock.get(0));
		assertEquals("mocktest", mock.get(1));
	}

	@Test
	void verificationBasics() {
		String one = mock.get(0);
		String two = mock.get(1);

		verify(mock).get(0);
		verify(mock, times(2)).get(anyInt());
		verify(mock, atLeast(1)).get(anyInt());
		verify(mock, atLeastOnce()).get(anyInt());
		verify(mock, atMost(2)).get(anyInt());
		verify(mock, never()).get(2);
	}

	@Test
	void argumentTest() {
		// SUT
		mock.add("someArgmt");
		// verification
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		assertEquals("someArgmt", captor.getValue());
	}

	@Test
	void multipleArgsCapture() {
		// SUT
		mock.add("someArgmt1");
		mock.add("someArgmt2");

		// verification
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		List<String> allValues = captor.getAllValues();
		assertEquals("someArgmt1", allValues.get(0));
		assertEquals("someArgmt2", allValues.get(1));

	}

	@Test
	public void mocking() {
		ArrayList arrayListMock = mock(ArrayList.class);
		System.out.println(arrayListMock.get(0));// null
		System.out.println(arrayListMock.size());// 0
		arrayListMock.add("Test");
		arrayListMock.add("Test2");
		System.out.println(arrayListMock.size());// 0
		when(arrayListMock.size()).thenReturn(5);
		System.out.println(arrayListMock.size());// 5
	}

	@Test
	public void spying() {
		ArrayList arrayListSpy = spy(ArrayList.class);
		arrayListSpy.add("ele-1");
		System.out.println(arrayListSpy.get(0));// ele-1
		System.out.println(arrayListSpy.size());// 1

		arrayListSpy.add("ele-2");
		arrayListSpy.add("ele-3");
		System.out.println(arrayListSpy.size());// 0
		when(arrayListSpy.size()).thenReturn(5);
		System.out.println(arrayListSpy.size());// 5
		arrayListSpy.add("ele-4");
		verify(arrayListSpy).add("ele-4");
	}

}
