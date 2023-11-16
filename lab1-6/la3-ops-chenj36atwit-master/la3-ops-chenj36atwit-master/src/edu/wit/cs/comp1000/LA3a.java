package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA3a {

	public static void main(String[] args) {
		
		double num1, num2, num3;
		
		double L1, L2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		System.out.print("Enter operation: ");
		String s = input.next();
	
		if(s.equals("min")) {
			if(num1 <= num2 && num1 <= num3) {
				System.out.printf("min(%.2f, %.2f, %.2f) = %.2f%n",num1,num2,num3,num1);
			}
			else if(num2 <= num1 && num2 <= num3) {
				System.out.printf("min(%.2f, %.2f, %.2f) = %.2f%n",num1,num2,num3,num2);
			}
			else {
				System.out.printf("min(%.2f, %.2f, %.2f) = %.2f%n",num1,num2,num3,num3);
			}
		}
		
		else if(s.equals("l1")) {
			L1 = Math.abs(num1) + Math.abs(num2) + Math.abs(num3);
			
			System.out.printf("l1(%.2f, %.2f, %.2f) = %.2f%n",num1,num2,num3,L1);
		}
		
		else if(s.equals("l2")){
			L2 = Math.sqrt((Math.pow(num1, 2)) +  (Math.pow(num2, 2)) + (Math.pow(num3, 2)));
		
			System.out.printf("l2(%.2f, %.2f, %.2f) = %.2f%n",num1,num2,num3,L2);
		}
		
		else {
			System.out.println("Invalid operation!");
			System.exit(0);
		}
		
		
	}

}
