package com.training.javahackathon;

public class IfElse {
	
	public static void main(String[] args) {
		//WJP to find the highest recurring figure
		int a = 100;
		int b = 200;
		int c = 90;
		
		// true & true = true
		// false & true = false
		
		if(c > a & c > b) { 
			System.out.println(" c is greatest value ");
		}
		else if(a > b) {
			System.out.println(" a is greatest value ");
		} else {
			System.out.println(" b is greatest value ");
		}
		System.out.println("*********");
		
		for(int k=10;k>1;k--) {
			System.out.println(k);
		}
		
	}

}
	
	
