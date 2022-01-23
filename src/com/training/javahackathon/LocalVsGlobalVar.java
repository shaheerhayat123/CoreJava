package com.training.javahackathon;

public class LocalVsGlobalVar {
	//Global Variables, to Access use Object reference variable
	String name = " Tom ";
	int age = 27;
	
	
	public static void main(String[] args) {
		int i = 10; //local variable for main method
		System.out.println(i);//printing local var in main method
		
		LocalVsGlobalVar obj = new LocalVsGlobalVar();//creating object w/ obj ref var
		//printing global var
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {
		//Local Variables for sum method
		int i = 15;
		int j = 20;
		
	}
	
	

		
		
	

}
