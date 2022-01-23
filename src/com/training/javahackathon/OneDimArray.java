package com.training.javahackathon;

public class OneDimArray {
	
	//disadvantage: size is fixed(arrayoutofbounds exception). stores only similar data types
		//to overcome size is fixed use dynamic array: use collections; arraylist, hashtable
		// to overcome only similar data types use Object Array
		
		public static void main(String[] args) {
			int i[] = new int [4];
			 i[0] = 10;
			 i[1] = 20;
			 i[2] = 30;
			 i[3] = 40;
			 
			 //System.out.println(i[3]);
			 //System.out.println(i.length);// print length of array
			 
			 //to print all  values of array use for loop
			 for(int j = 0;j<i.length;j++) {
				 System.out.println(i[j]);
			 }
			  double d[] = new double [4];
			  d[0] = 0.0;
			  d[1] = 1.0;
			  d[2] = 2.0;
			  d[3] = 3.0;

			  for(int j=0;j<d.length;j++) {
				  System.out.println(d[j]);
			  }
			  
			  char c[] = new char [4];
			  c[0] = 'a';
			  c[1] = 'b';
			  c[2] = 'c';
			  c[3] = 'd';
			  
			  for(int j=0;j<c.length;j++) {
				  System.out.println(c[j]);
			  }
					  
					  
		
		}

}
