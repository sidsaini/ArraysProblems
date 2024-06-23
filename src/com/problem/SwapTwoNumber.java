package com.problem;


public class SwapTwoNumber {
	
public static void swap(int a, int b)
{
	System.out.println("Number a before swap :"+a);
	System.out.println("Number b before swap :"+b);
	
	int temp = a;
	a = b;
	b = temp;
	
	System.out.println("Number a After swap :"+a);
	System.out.println("Number b After swap :"+b);
	
}

public static void main(String[] args) {
	
	int a = 10;
	int b = 12;
	
	swap(a, b);
	
}
	
	

}
