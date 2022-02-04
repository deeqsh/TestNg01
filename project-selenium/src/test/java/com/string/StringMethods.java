package com.string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 String str = new String("Hello");
		
	 
	
	  //System.out.println(str.length());
	 
	  
	  System.out.println("Index "+str.indexOf(0));
	 
	  System.out.println("Lower Case: "+ str.toLowerCase());
	 
	 
	 System.out.println("Upper Case: "+str.toUpperCase());
	 
	 System.out.println("First Character: "+str.charAt(0));
	 
	 System.out.println("Replace Hello to : " + str.replace("Hello", "Namaste"));
	  
	 System.out.println(str.compareTo(str));
	}

}
