package com.stackroute.pe3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//calculates first and last date of a week
public class DateOfWeek {
	public void firstAndLastDate() {
	
//		Get current date
		LocalDate today = LocalDate.now();
		String dateFormat = "E dd/MM/yyyy";
		
		// Go backward to get Monday
		LocalDate monday = today;
		while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
			monday = monday.minusDays(1);
		}
		
		// Go forward to get Sunday
		LocalDate sunday = today;
		while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
			sunday = sunday.plusDays(1);
		}
		
		System.out.println("First Date of the Week: " + monday.format(DateTimeFormatter.ofPattern(dateFormat)));
		System.out.println("Last Date of the Week: " + sunday.format(DateTimeFormatter.ofPattern(dateFormat)));
	}
}
