package com.problem;

import java.util.Scanner;

public class FrequencyArray {
	
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
		
		int[] arr = {10,20,30,40,50};
		
		
		
		int[] freq = makeFrequencyArray(arr);
		
		System.out.println("Enter the numbr of queries :");
		int q = sc.nextInt();
		
		
		
		while(q > 0)
		{
			System.out.println("Enter number to be searched :");
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
		}
	}

}
