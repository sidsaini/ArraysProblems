package com.problem;

import java.util.Scanner;

public class ArrayRotate {
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void reverse(int[] arr, int i ,int j)
	{
		
		 
		 while(i < j)
		 {
			swap(arr,i,j);
			i++;
			j--;
		 }
	}
	
	static void rotateInPlace(int[] arr, int k)
	{
		int n = arr.length;
		k = k % n;
		
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k,n-1);
		reverse(arr, 0, n-1);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		
		rotateInPlace(arr, k);
		print(arr);
	}

}
