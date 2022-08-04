package com.sapient.mock.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class MockitoTestEx01 {

	@Test
	void test() {
		// ctrl + 2 + l 
		List list = mock(List.class);
		when(list.size()).thenReturn(2); 
		assertEquals(2, list.size());
		
	}

	@Test
	void test2() {
		// ctrl + 2 + l 
		List list = mock(List.class);
		when(list.size()).thenReturn(2).thenReturn(3).thenReturn(4);
		
		assertEquals(2, list.size());
		assertEquals(3, list.size());
		assertEquals(3, list.size());
		
	}

}
