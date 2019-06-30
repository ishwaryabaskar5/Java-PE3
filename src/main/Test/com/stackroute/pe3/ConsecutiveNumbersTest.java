package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
	
	ConsecutiveNumbers consecutiveNumbers = null;
	
	@Before
	public void setUp(){
		consecutiveNumbers = new ConsecutiveNumbers();
	}
	
	@After
	public void tearDown(){
		consecutiveNumbers = null;
	}
	
	@Test
	public void  test1() {
		String result = consecutiveNumbers.checkConsecutive("98,96,95,94,93");
		assertEquals("98,96,95,94,93 non consecutive numbers",result);
	}
	
	@Test
	public void  test2() {
		String result = consecutiveNumbers.checkConsecutive("54,53,52,51,50,49,48");
		assertEquals("54,53,52,51,50,49,48 are consecutive numbers",result);
	}
	
	@Test
	public void  test3() {
		String result = consecutiveNumbers.checkConsecutive("1,2,3,4,5,6,6");
		assertEquals("1,2,3,4,5,6,6 non consecutive numbers",result);
	}
	
}