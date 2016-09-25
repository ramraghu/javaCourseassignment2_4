package com.acadgild.learnJava;

public class assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to find highest among three given numbers
		int a = 7;
		int b = 9;
		int c = 5;
		if (a>b) {
			if (a>c){
				System.out.println("Greatest Number is :" + a); 
						
			 } else { 
				 System.out.println("Greatest Number is :" + c);
			 }
		} else if (b > c ) {
			System.out.println("Greatest number is :" + b);
		} else { 
			System.out.println("Greatest Number is :" + c);
		}
			
	}

}
