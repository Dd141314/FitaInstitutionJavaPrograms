package com.fita.institutions.programs;

/**
 * We cannot have private or protected classes
 * Public Class name Should be the file Name
 * We can have multiple default classes and it is visible only to the particular folder
 * The best Practices is to create one java class per file and it
 * should be in public access modifier
 * Inner Classes can be private and protected and static types
 * In Bin Folder, Will have seperate Files for all the classes and Inner Class
 * 
 * Why we need Inner Classes ?
 * 
 * If you dont want to access that class or test the class by others.
 * 
 * Static Classes ?
 * 
 * If the Class is static, we can have both static and non static methods
 * 
 * 
 */

public class VisibilityDemo {
	
	private class PrivateInnerClassTest{
		
		private void display() {
			System.out.println("Print private method");
		}
	}
	
	protected class ProtectedInnerClassTest{
		protected void display() {
			System.out.println("Print private method");
		}
	}
	
	public static class StaticInnerClassTest{
		public void display() {
			System.out.println("Print static method");
		}
	}
	
	void createInstanceForPrivate() {
		PrivateInnerClassTest privateInnerClassTest = new PrivateInnerClassTest();
		privateInnerClassTest.display();
	}

	public static void main(String[] args) {
		
		VisibilityDemo obj1 = new VisibilityDemo() ;
		obj1.createInstanceForPrivate();
						
		VisibilityDemo.StaticInnerClassTest obj2 = new VisibilityDemo.StaticInnerClassTest();
		obj2.display();
		
		
	}

}

class A{
	
}

class B {
	
}
