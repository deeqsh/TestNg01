package com.controlflow;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 20, 30, 40, 50, 60, 70};
		System.out.println("Size of array :" +a.length);
		
		for(int b : a) {
			System.out.println(b);
			if(b == 30) {
				break;
			}
		}

	

	{ int sum = 0;
	for(int b : a) {
		sum = sum + b;
			}
	System.out.println(sum);
     }
}
}