package com.training.javahackathon;

import java.util.Arrays;

public class SortedArray {

	//Given an array of integers, sort the integer values. *
	
	public static void main(String[] args) {
	//custom input array	
	
	int[] arr = {1, 0, 2, 5, 8, 10};
	
	// Applying sort() method over to above array
    // by passing the array as an argument

	Arrays.sort(arr);
	
	//Printing the now sorted array
	
	System.out.println(Arrays.toString(arr));
		
		
	
	}
}
