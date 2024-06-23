package com.problem;

import java.util.Scanner;

public class FrequencyArray1 {
	
	public static int[] makeFrequencyArray(int[] arr)
	{
		int[] freq = new int[100005];
		
		for(int i = 0; i < arr.length; i++)
		{
			freq[arr[i]]++;
		}
		return freq;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.print("Enter the elements of array :");
		
		for(int i = 0; i < n; i++)
		{
			array[i] = sc.nextInt();
		}
		
		int[] freq = makeFrequencyArray(array);
		
		System.out.println("Enter the numbr of queries :");
		int q = sc.nextInt();
		
		while(q > 0)
		{
			System.out.println("Enter the number to be searched :");
			int x = sc.nextInt();
			
			if(freq[x] > 0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			q--;
	
		}}

}
