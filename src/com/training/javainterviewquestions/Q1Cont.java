package com.training.javainterviewquestions;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1Cont {

	public static void main(String[] args) {
		
		//Removing items from a collection
		//Use an iterator to remove numbers less than 20 from a collection:
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(14);
		numbers.add(14);
		numbers.add(34);
		numbers.add(38);
		
		 Iterator<Integer> it = numbers.iterator();
		    while(it.hasNext()) {
		      Integer i = it.next();
		      if(i < 20) {
		        it.remove();
		      }
		    }
		    System.out.println(numbers);

	}

}
