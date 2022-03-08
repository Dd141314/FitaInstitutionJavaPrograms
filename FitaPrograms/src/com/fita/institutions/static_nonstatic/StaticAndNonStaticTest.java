package com.fita.institutions.static_nonstatic;

public class StaticAndNonStaticTest {

	int x; // global & instance level
	int y; // global & instance level
	static int z; // global & class level

	int firstNumber = 0;
	int secondNumber = 1;
	int $thridNumber = 2;
	int _forthNumber = 3;

	public static void display() {
		System.out.println("Hello static method from the class StaticAndNonStaticTest");
	}

	public void printValues() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

	public static void main(String[] args) {
		display();

		StaticAndNonStaticTest obj1 = new StaticAndNonStaticTest();
		obj1.x = 100;
		obj1.y = 200;
		obj1.z = 300;
		obj1.printValues();

		StaticAndNonStaticTest obj2 = new StaticAndNonStaticTest();
		obj2.x = 1000;
		obj2.printValues();

		StaticAndNonStaticTest obj3 = new StaticAndNonStaticTest();
		obj3.z = 3000;
		obj3.printValues();
		obj1.printValues();

	}

}
