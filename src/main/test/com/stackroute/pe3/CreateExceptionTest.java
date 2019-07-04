package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateExceptionTest {
	
	CreateException createException;
	
	@Before
	public void setUp(){
		createException = new CreateException();
	}
	
	@After
	public void tearDown(){
		createException = null;
	}
	
	@Test
	public void  givenInput1ShouldReturnArrayIndexOutOfBoundsException() {
		int[] arr = {1,2};
		String result = createException.createException(5,arr);
		assertEquals("Array index out of bound exception",result);
	}
	
	@Test
	public void  givenInputShouldReturnNegativeArraySizeException() {
		int[] arr = {1,2};
		String result = createException.createException(-2,arr);
		assertEquals("Negative array size exception",result);
	}
	
	@Test
	public void  givenInputShouldReturnNullPointerExceptionn() {
		int[] arr = {1,2};
		String result = createException.createException(3,null);
		assertEquals("Null pointer exception",result);
	}
	
}