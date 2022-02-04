package com.selenium.tests;

public class MethodsExample extends afterbreak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsExample method = new MethodsExample();
		int sum = method.sum(10, 20 );
		System.out.println(sum);
		
		method.print("deepti");
		method.checkEvenOdd(99);
		method.checkEvenOdd(90);
	}

	
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public void print(String name) {
		System.out.println(name);
	}
	
	public void checkEvenOdd(int number) {
		   if (number % 2 == 0) {
		System.out.println("Even Number");
		   }else {
			  System.out.println("Odd Number");
		   }
		}
}
