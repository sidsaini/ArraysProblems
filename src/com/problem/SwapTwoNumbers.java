package com.problem;

public class SwapTwoNumbers {
	
	public static void swapInArray(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr [i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void reverseArray(int[] arr)
	{
		int i = 0;
		int j = arr.length-1;
		
		while(i < j)
		{
			swapInArray(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60};
		reverseArray(array);
		print(array);
		
	}

}
