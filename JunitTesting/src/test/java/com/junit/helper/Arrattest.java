package com.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Arrattest {

	@Test
	public void testArraySort() {
		int i[] = { 12, 11, 15, 6, 7 };
		int j[] = { 6, 7, 11, 12, 15 };
		Arrays.sort(i);
		assertEquals(j, i);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int i[] = null;
		Arrays.sort(i);
	}

	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = { 12, 23, 4 };
		for (int i = 1; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
