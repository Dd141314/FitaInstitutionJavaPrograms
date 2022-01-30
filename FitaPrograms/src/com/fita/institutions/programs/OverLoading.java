package com.fita.institutions.programs;

/**
 * 
 * 
 * All the method names are same but different set of arguments
 * Change in the return type does not matters in the over loading, Only no of arguments and type of arguments matters 
 * in the method over loading
 * 
 * ---> It is also called as "Call by Value" (Passing primitive types, is called as call by value)
 * 
 *  Calling method with Objects is called Call by Reference
 *  
 *  
 *  Real Time Example
 *   
 *  Login Functionality -> 1) Email login
 *  2) Mobile Login
 */

public class OverLoading {
	
//	public void add(int a, int b) {
//		System.out.println(a+b);
//	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, float b) {
		System.out.println(a+b);
	}

	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add() {
		System.out.println("test");
	}
	
	

	public void add(String s1, String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		
		String s1 = "Dharanidharan";
		String s2 = " P";
		
		OverLoading obj = new OverLoading();
		obj.add();
		
		OverLoading obj1 = new OverLoading();
		obj1.add(a, b);

		obj1.add(a, b, c);
		
		obj1.add(s1,s2);

	}

}
