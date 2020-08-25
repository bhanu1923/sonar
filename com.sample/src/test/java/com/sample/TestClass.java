package com.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	caluclation obj = new caluclation();
	
	@Test
	public void testcalc() {
		assertEquals(4,obj.adder(2, 2));
	}
}