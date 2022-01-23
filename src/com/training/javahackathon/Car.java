package com.training.javahackathon;

public class Car {
	
	int year;
	String make;
	String model;
	
	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.year = 2006;
		a.make = " BMW ";
		a.model = " 325i ";
		
		b.year = 2013;
		b.make = " Nissan ";
		b.model = " Altima ";
		
		c.year = 2014;
		c.make = " BMW ";
		c.model =  "328i "; 
		
		System.out.println(c.year);
		System.out.println(c.make);
		System.out.println(c.model);
		
		//shifting of object reference variables
	
		a = b;
		b = c;
		c = a;
		a.year = 2007;
		System.out.println(a.year);
		c.year = 2017;
		System.out.println(c.year);
		
		
		
		
		
	}

}
