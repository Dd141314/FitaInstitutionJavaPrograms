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

public class OverLoadDemo {
	
	public void add(int a , int b) {
		System.out.println("The sum is "+ (a+b));
	}
	
	public int add (int a , int b, int c)
	{
		System.out.println("The sum is "+ (a+b+c));
		return a+b+c;
	}
	
	public float add (float a , float b)
	{
		System.out.println("The sum is "+ (a+b));
		return a+b;
	}
	
	public String add (String s1, String s2) {
		return s1 + s2;
	}
	

	public static void main(String[] args) { 
		int a = 10, b = 10, c = 10;
		float x = 5.5f, y = 5.5f;
		OverLoadDemo overLoadDemo = new OverLoadDemo();
		overLoadDemo.add(a, b);
		String fullName = overLoadDemo.add("Dharanidharan", "Palanisamy");
		System.out.println(fullName);

	}

}
