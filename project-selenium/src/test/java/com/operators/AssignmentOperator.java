package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 
		int a = 90;
		int b = 20;
		
		//a = a+b;[is same as a += b]
		
		a += b; // a = 90 +20
		
		a -= b; // a=a-b( 110-20=90)
		
		a *= b; // a = a*b(90)
		
		b/=a; //b = b/a
		
		System.out.println(a);
	}

}
