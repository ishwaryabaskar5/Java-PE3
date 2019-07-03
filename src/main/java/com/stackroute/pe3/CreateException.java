package com.stackroute.pe3;

public class CreateException {
	public static void main(String[] args){
		try {
//			int[] arr = new int[-2];			//Negative array size exception
			
//			int[] arr1 = new int[3];
//			arr1[3] = 5;                        //Array index out of bound exception
			
			int[] arr2 = null;
			int len = arr2.length;              //Null pointer exception
			System.out.println(len);
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception");
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println("Negative array size exception");
		}
		catch (NullPointerException e){
			System.out.println("Null pointer exception");
			
		}
	}
}
