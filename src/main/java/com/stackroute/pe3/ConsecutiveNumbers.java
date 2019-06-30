package com.stackroute.pe3;

//checks whether the sequence of numbers are consecutive numbers or not
public class ConsecutiveNumbers {

//	accepts series of number as a string, return type string
	public String checkConsecutive(String s){
	
//		Split a number series into individual string by splitting
		String[] str = s.split(",");
		
//		declaration and initialization
		int[] num = new int[str.length];
		boolean isConsecutive = false;
		String result = "";
		
//		converts string into integers
		for(int i=0;i<str.length;i++){
			num[i] = Integer.parseInt(str[i]);
		}
		
		if(num[0] == num[1]+1){                 //  checks for ascending
			for (int i = 0; i<num.length-1;i++){
				if(num[i] == num[i+1]+1){       //	series of numbers are consecutive in ascending
					isConsecutive = true;
				}else {                         // non consecutive numbers
					isConsecutive = false;
					result = s+" non consecutive numbers";
					break;
				}
			}
		} else if(num[0] == num[1]-1){          //  checks for descending
			for (int i = 0; i<num.length-1;i++){
				if(num[i] == num[i+1]-1){       //	series of numbers are consecutive in descending
					isConsecutive = true;
				}else {                         // non consecutive numbers
					isConsecutive = false;
					result = s+" non consecutive numbers";
					break;
				}
			}
		} else {                                    // non consecutive numbers
			isConsecutive = false;
			result = s + " non consecutive numbers";
		}
		
		if (isConsecutive == true)
			result = s+" are consecutive numbers";
		
		return result;
	}
}
