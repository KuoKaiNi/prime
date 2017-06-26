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
	
	@Test 
	public void testTwoString(){
		int result = calculator.add("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void testTheAddMethodToHandleAnUnknownAmountOfNumbers(){
		int result = calculator.add("1,2,3,4,5");
		assertEquals(15, result);
	}
	
	@Test
	public void testAllowTheAddMethodToHandleNewLinesBetweenNumbers(){
		int result = calculator.add("1\n2,3");
		assertEquals(6, result);
	}
	
	@Test (expected = RuntimeException.class)
	public void testAllowTheAddMethodToHandleNewLinesBetweenNumbersNotOK(){
		int result = calculator.add("1,\n");
	}

}
