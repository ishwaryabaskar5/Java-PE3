package com.stackroute.pe3;

// creates custom exception
public class CustomExceptions {
	public static void main(String[] args){
	
//		try block
		try{
		 throw new MyException("My new exception");
		} catch (Exception e){                      //  catch block
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
//		finally block
		finally {
			System.out.println("Finally block executed");
		}
	}
}

//custom exception class
class MyException extends Exception{
	public MyException(String s){
		super(s);
	}
}