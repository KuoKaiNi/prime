package com.stringcalculate.kata;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator calculator;
	
	@Before
	public void setUp() throws Exception {
		calculator = new StringCalculator();
	}

	@After
	public void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	public void testEmptyString() {
		int result = calculator.add("");
		assertEquals(0, result);
	}
	
	@Test
	public void testOneString(){
		int result = calculator.add("1");
		assertEquals(1, result);
	}

}
