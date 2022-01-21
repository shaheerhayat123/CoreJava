package com.training.javahackathon;

public class ObjectArray {
	//Object is a superclass, starts with capital like all classes
	//to store values of different data types
	
	public static void main(String[] args) {
		Object ob[] = new Object[4];
		ob[0] = "Hello";
		ob[1] = 10;
		ob[2] = 'M';
		ob[3] = 12.22;
		
		//print all values using for loop
		for(int j=0;j<ob.length;j++) {
			System.out.println(ob[j]);
		}
		
		
	}
	

}
