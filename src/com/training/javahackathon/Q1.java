package com.training.javahackathon;

public class Q1 {

	//there is 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true
	
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = true;
		boolean c = false;
		
		//maintaining a counter
		int count = 0;
		
		//check if a is true, increment counter
		if(a)
			count+= 1;
		
		//check if b is true, increment counter
		if(b)
			count+=1;
		 //check if c is true, increment counter;
		if(c)
			count+=1;
		
		//check counter value
		if(count == 2)
			System.out.println("Two variables are true");
		
		else
			System.out.println("Two variables are not true");
		
	}

}
