package com.problem;


public class ReverseArray {
	
	static int[] reverse(int[] arr)
	{
		int n = arr.length;
		int[] answer = new int[n];
		int j = 0;
		
		for(int i = n-1; i >= 0; i--)
		{
			answer[j++] = arr[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50};
		int[] answer = reverse(array);
		for(int i = 0; i < answer.length; i++)
		{
			System.out.println(answer[i] + " ");
		}
	}

}
