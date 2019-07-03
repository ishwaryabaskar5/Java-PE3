package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RemoveVowelsTest {
	
	RemoveVowels removeVowels = null;
	private PrintStream originalOut = System.out;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		removeVowels = new RemoveVowels();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
		removeVowels = null;
		System.setOut(originalOut);
	}

	@Test
	public void calculateDate(){
		removeVowels.removeVowel("India", "United States", "Germany", "Egypt", "czechoslovakia");
		assertEquals("Place Name without Vowels:0 Ind\nPlace Name without Vowels:1 Untd Stts\nPlace Name without" +
				" Vowels:2 Grmny\nPlace Name without Vowels:3 Egypt\nPlace Name without Vowels:4 czchslvk\n",outContent.toString());
	}
	
}