package com.controlflow;

public class NestedIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 95;
		
		if (marks > 90) {
			System.out.println("Grade A");
		} else if (marks >75 && marks <=90 ) {
			System.out.println("Grade B");
		} else if (marks > 60 && marks <= 75 ){
			System.out.println("Grade C");
		} else if (marks > 40 && marks <= 60) {
			System.out.println("Grade D");
		} else {
			System.out.println("Failed");
		}
		
		System.out.println("Execution Done");
		
		

	}

}
