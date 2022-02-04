package com.operators;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "dspspsd"; // object of String Class
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Strint to verify if it is a palindrome");
		
		original = in.nextLine();
		int length = original.length();
		for (int i=length-1;i>0;i--)
			reverse = reverse + original.charAt(i);
			if (original.equals(reverse))
System.out.println("Entered number/String is Palindrome");
else 
	System.out.println("Entered Number/String is not Palindrome");
	}
	

}
