package com.problem;

import java.util.Scanner;

public class RotateArray {
	
	public static int[] rotate(int[] arr,int k)
	{
		int n = arr.length;
		int[] answer = new int[n];
		k = k % n;
		int j = 0;
		
		
			for(int i = n-k; i < n; i++)
			{
				answer[j++] = arr[i];
			}
			for(int i = 0; i < n-k; i++)
			{
				answer[j++] = arr[i];
			}
			return answer;
		}
	
public static void print(int[] arr)
{
	for(int i= 0; i < arr.length; i++)
	{
		System.out.print(arr[i] + " ");
	}
}

  public static void main(String[] args) {
	  
	  int[] arr = {10,20,30,40,50,60};
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the value of k :");
	  int k = sc.nextInt();
	  
	  int[] answer  = rotate(arr, k);
	  print(answer);
	
}
	  
	}


