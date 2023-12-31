package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA4a {
	
	/**
	 * Error to output if either input is not positive
	 */
	static final String E_POSITIVE = "Inputs must both be positive.";

	public static void main(String[] args) {
		int num1, num2, total;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		num1 = input.nextInt();
		System.out.print("Enter b: ");
		num2 = input.nextInt();
		
		if(num1 > 0 && num2 > 0) {
		
		total = gcd (num1, num2);
		System.out.printf("The GCD of %d and %d is %d%n", num1, num2, total);
		}
		else {
			System.out.println(E_POSITIVE);
		}
	}
	
	/**
	 * Returns the greatest common denominator (gcd) of two positive integers
	 * 
	 * @param num1 integer 1
	 * @param num2 integer 2
	 * @return gcd of integers 1 and 2
	 */
	public static int gcd(int num1, int num2) {
		  
		if (num1 == 0)
	        return num2;

	    while (num2 != 0) {
	        if (num1 > num2)
	            num1 = num1 - num2;
	        else
	            num2 = num2 - num1;
	    }

	    return num1;
	}

}