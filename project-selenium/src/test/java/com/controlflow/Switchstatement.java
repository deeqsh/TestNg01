package com.controlflow;

public class Switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 110;
		
		
 	switch (marks) {
		case 10: 
			System.out.println("Value is 10");
            
		case 20:
			System.out.println("Value is 20");
			
		case 30:
			System.out.println("Value is 30");
			break;
		case 40:
			System.out.println("Value is 40");
			break;
		case 50:
			System.out.println("Value is 50");
			break;
		case 60:
			System.out.println("Value is 60");
			break;
		case 70:
			System.out.println("Value is 70");
			break;
		case 80:
			System.out.println("Value is 80");
			break;
		case 90:
			System.out.println("Value is 90");
			break;
		case 100:
			break;
			default:
				System.out.println("Value is greater than 100");
		}
		System.out.println("Execution is done");

					
		}
}


