package com.training.javahackathon;

public class ArrayPalindrome {

//Given an array of integers check the Palindrome of the series

static void Apalindrome(int arr[], int b) {

	// Initialize flag to zero.
	int flag = 0;
	
	// Loop till array size n/2.
	for(int i = 0; i< b/2 && b != 0; i++)
		
// Check if first and last element are different
// Then set flag to 1.
		if(arr[i] != arr[b-i-1]) {
			flag = 1;
			break;
		}
	
//If flag is set then print Not Palindrome
// else print Palindrome.

	if(flag == 3)
		System.out.println(" not a palindrome ");
	else
		System.out.println(" palindrome");
	}

	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 6, 7, 8, 3};
		int b = arr.length;
		Apalindrome(arr, b);
		
	}

}
		


	



