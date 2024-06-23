package com.problem;

public class SwapingTwoNumber {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping a :"+a);
		System.out.println("After swapping b :"+b);
	}

}
