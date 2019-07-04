package com.stackroute.pe3;

public class StudentGrades {
	
	public void calculateGrade(int n, int ...a){
	
//	    if n not equal to array length
		if(n != a.length){
			System.out.print("You need to enter "+n+" grades. But you have entered only "+a.length+" grades");
			return;
		}
			
		for(int i = 0; i < n; i++){
			if(a[i]<0 || a[i] > 100){       // not a valid grade
				System.out.print("Please enter valid grades");
				return;
			}
		}
		System.out.print("Thank you for entering your marks");
		
	}
}
