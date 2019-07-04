package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class DateOfWeekTest {
	
	private DateOfWeek dateOfWeek;
	private PrintStream originalOut = System.out;
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		dateOfWeek = new DateOfWeek();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void tearDown(){
		dateOfWeek = null;
		System.setOut(originalOut);
	}
	
	@Test
	public void givenInputShouldReturnFirstAndLastDayOfWeek(){
		LocalDate date = LocalDate.of(2019,07,03);
		dateOfWeek.firstAndLastDate(date);
		assertEquals("First Date of the Week: Mon 01/07/2019\n" +
				"Last Date of the Week: Sun 07/07/2019\n",outContent.toString());
	}
	
	@Test
	public void givenInputShouldReturnErrorMessage(){
		LocalDate date = null;
		dateOfWeek.firstAndLastDate(date);
		assertEquals("Date should not be null",outContent.toString());
	}
}