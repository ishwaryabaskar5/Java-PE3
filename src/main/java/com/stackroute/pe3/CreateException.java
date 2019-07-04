package com.stackroute.pe3;

public class CreateException {
	public String createException(int size, int[] arr2){
		try {
			int len = arr2.length;              //Null pointer exception
			
			int[] arr1 = new int[size];			//Negative array size exception
			
			arr1[size+1] = 5;                        //Array index out of bound exception
			
			
		} catch (ArrayIndexOutOfBoundsException e)
		{
			return "Array index out of bound exception";
		}
		catch (NegativeArraySizeException e)
		{
			return "Negative array size exception";
		}
		catch (NullPointerException e){
			return "Null pointer exception";
			
		}
		return "Success";
	}
}
