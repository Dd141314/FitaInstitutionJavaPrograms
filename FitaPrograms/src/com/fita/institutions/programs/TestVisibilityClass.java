package com.fita.institutions.programs;

/**
 * We cannot have private or protected classes
 * Public Class name Should be the file Name
 * We can have multiple default classes and it is visible only to the particular folder
 * The best Practices is to create one java class per file and it should be in public access modifier
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

public class TestVisibilityClass {
	
	private class TestPrivate{
		
	}
	
	protected class TestProtected{
		
	}
	
	static class TestStatic{
		
		public static void testStaticMethodInsideStatic() {
			System.out.println("Test inside testStaticMethodInsideStatic");
		}
		
		public void testNonStaticMethodInsideStatic() {
			System.out.println("Test inside testNonStaticMethodInsideStatic");
		}
		
	}

	public static void main(String[] args) {
		TestVisibilityClass.TestStatic testVisibilityStaticClass = new TestVisibilityClass.TestStatic();
		testVisibilityStaticClass.testNonStaticMethodInsideStatic();
		TestStatic.testStaticMethodInsideStatic();
		
	}

}

class Test {
	
}