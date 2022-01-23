package com.training.javahackathon;

public class FunctionsInJava {
	
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30,10);
		System.out.println(div);
	
		}

	public void test() {
		System.out.println(" Test Method ");
		//no input, some output,  no return type
	}
	
	public int pqr() {
		System.out.println(" pqr method ");
		int a = 10;
		int b = 20;
		int c = a + b;
		
		return c;//no input, some output, return type int
	}
	
	public String qa() {
		System.out.println(" qa method ");
		String s = " Selenium ";
		
		return s;//no input, some output, return type String
	}
	
	public int division(int x,int y ) {
		int d = x/y;
		System.out.println(" division method ");
		return d; //Arguments/Input Parameters, return type int
		
	}
}
