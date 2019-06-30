package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateOfWeekTest {
	
	DateOfWeek dateOfWeek;
	
	@Test
	public void calculateDate(){
		dateOfWeek = new DateOfWeek();
		dateOfWeek.firstAndLastDate();
	}
}