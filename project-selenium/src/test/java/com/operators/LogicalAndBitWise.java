package com.operators;

public class LogicalAndBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// // &&(both condition is true ), || either 
		
		// bitwise operator (&,|)it will give same result as logical 
		// but have some exceptions 
		
 int a =5;
 int b = 10;
 int c = 20;
 
//	System.out.println(a > b && b > c);// true false == false
	//false true == false 
	//false false == false 
	// true true == true 
	
	//System.out.println(a > b || b > c);
	//true false == true 
	//false true == true  
	//false false == false 
	// true true == true 
		
	System.out.println(a > b && ++b > c);
	                              //if first condition is false it will 
	                             //stop executing the next condition(++b) 
	System.out.println(a > b & ++b > c);
	                  // next condition++b is executed even first is false. 
	
	
	System.out.println(b);
	}

}
