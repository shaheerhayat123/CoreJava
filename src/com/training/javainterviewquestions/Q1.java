package com.training.javainterviewquestions;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {

	//What are iterators, explain with an example?
	
	//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
	//It is called an "iterator" because "iterating" is the technical term for looping.
	//import it from the java.util package.
	
	/*The iterator() method can be used to get an Iterator for any collection:*/
	public static void main(String[] args) {
		
		//make a collection
		ArrayList<String> shoes = new ArrayList<String>();
		shoes.add("Jordan 6 Bordeaux");
		shoes.add("Ultraboost Refelctive");
		shoes.add("Air force One 3M ");
		
		//Get the iterator
		
	Iterator<String> it = shoes.iterator();
	
	//print the 1st item
	
	/*System.out.println(it.next());*/
	
	//looping through a collection
	/*To loop through a collection,
	use the hasNext() and next() methods of the Iterator*/
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
		

	}

}
