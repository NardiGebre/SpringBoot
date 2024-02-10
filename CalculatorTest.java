package com.Nardos.Restaurant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Nardos.Restaurant.Calculator.Calculator;


public class CalculatorTest {
	Calculator cal = new Calculator();
	@Test 
	public void add() {
		int result = cal.add(1, 2);
		assertEquals(3, result);
	}
	
	@Test 
	public void sub() {
		int result = cal.sub(2, 1);
		assertEquals(1, result);		
	}
	
	@Test
	public void mul() {
		int result = cal.mul(2, 3);
		assertEquals(6, result);
	}
	
	@Test 
	public void div() {
		int result = cal.div(9, 3);
		assertEquals(3, result);
	}		
	
}
	