package com.java.others;


 class CustException extends Exception {
	String message;
	
	CustException(String str)  {
		message = str;
	}

public String toString() {
     return ("Custom Exception Occured : "+ message);
    
}

}


public class CostumException{
	public static void main (String args[]) {
		try {
			throw new CustomException("this is a Custom message");
		} catch (CustomException e) {
		   System.out.println(e);
		
	}
	finally {
		System.out.print("test");
	   }
	}
	
}