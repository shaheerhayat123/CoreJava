package com.training.javahackathon;

public class UniqueDuplicateNumbers {
	
	public static void main(String[] args) {
		int arr[] = {3, 6, 7, 7, 6 ,5, 4, 8, 1, 3, 10};
		int n = arr.length;
		uniquenumbers(arr, n);
		
	}

public static void uniquenumbers(int arr[], int n) {
	
	for(int i = 0; i < n; i++) {
		
		// Check if the picked element 
        // is already printed
		
		int j;
		for(j = 0; j < i; j++)
			if(arr[i] == arr[j])
				break;
		  // If not printed,then print it
	if (i==j)
		System.out.println(arr[i] + " ");
	}
	
}
		
	
}
