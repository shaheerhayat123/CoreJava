package com.training.javahackathon;

public class IncrementalDecrementalOperators {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = ++a; // pre increment, add + 1 & assign # to both variables 
		System.out.println(a);
		System.out.println(b);
		
		int p = 2;
		int q = --p; //pre decrement, decrease value of p by 1 then assign to both
		System.out.println(p);
		System.out.println(q);
		
		int i = 1;
		int j = i++; // post increment, assign to j then add +1
		System.out.println(i);
		System.out.println(j);
	
		int n = 2; //assigned to n
		int m = n--; //post decrement,  n-- is assigned to m
		System.out.println(m);
		System.out.println(n);
	
	
	
	
	}
	
	
	

}
