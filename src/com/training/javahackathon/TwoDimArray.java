package com.training.javahackathon;

public class TwoDimArray {
	public static void main(String[] args) {
		String x[][] = new String[2][2];
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B2";
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
	
		
	}

}
