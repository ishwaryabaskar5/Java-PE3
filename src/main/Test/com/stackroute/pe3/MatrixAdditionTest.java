package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
	
	MatrixAddition matrixAddition;
	
	@Before
	public void setUp(){
		matrixAddition = new MatrixAddition();
	}
	
	@After
	public void tearDown(){
		matrixAddition = null;
	}
	
	@Test
	public void  add() {
		matrixAddition.addMatrix();
	}
}