package com.controlflow;

public class CalculatorExample {

	public CalculatorExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1 = 40;
		int value2 = 30;
		
		CalculatorExample myCalculator = new CalculatorExample();
		System.out.println("Adding" +  value1 + "with"  + value2);
		long result = myCalculator.add( value1, value2);
		System.out.println("Result is:"  + result);
		
	}
public long add(int a, int b) {
	return a + b;
}
}
