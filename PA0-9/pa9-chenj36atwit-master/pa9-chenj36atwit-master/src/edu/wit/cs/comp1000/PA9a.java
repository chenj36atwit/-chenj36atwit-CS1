package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA9a {

	/**
	 * Program execution point:
	 * input two fractions via the keyboard
	 * (using the Scanner constructor),
	 * output the two fractions, all pairwise
	 * {+ - * /} operations, and the first squared
	 * minus the second 
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Fraction f1;
		Fraction f2;
		int f1N, f1D, f2N, f2D;
		
		// Test Fraction class methods
		System.out.println("== F1 ==");
		System.out.print("Enter numerator: ");
		f1N = scan.nextInt();
		System.out.print("Enter denominator: ");
		f1D = scan.nextInt();
		
		f1 = new Fraction(f1N, f1D);
		
		System.out.println("== F2 ==");
		System.out.print("Enter numerator: ");
		f2N = scan.nextInt();
		System.out.print("Enter denominator: ");
		f2D = scan.nextInt();
		
		f2 = new Fraction(f2N, f2D);
		
		System.out.println();
		
		// toString test
		System.out.println("F1: " + f1);
		System.out.println("F2: " + f2);
		
		// add test
		System.out.println("F1+F1: " + f1.plus(f1));
		System.out.println("F2+F2: " + f2.plus(f2));
		System.out.println("F1+F2: " + f1.plus(f2));
		System.out.println("F2+F1: " + f2.plus(f1));
		
		// subtract test
		System.out.println("F1-F1: " + f1.minus(f1));
		System.out.println("F2-F2: " + f2.minus(f2));
		System.out.println("F1-F2: " + f1.minus(f2));
		System.out.println("F2-F1: " + f2.minus(f1));
		
		// multiply test
		System.out.println("F1*F1: " + f1.times(f1));
		System.out.println("F2*F2: " + f2.times(f2));
		System.out.println("F1*F2: " + f1.times(f2));
		System.out.println("F2*F1: " + f2.times(f1));
		
		// divide test
		System.out.println("F1/F1: " + f1.divides(f1));
		System.out.println("F2/F2: " + f2.divides(f2));
		System.out.println("F1/F2: " + f1.divides(f2));
		System.out.println("F2/F1: " + f2.divides(f1));
		
		// multiple operator test
		System.out.printf("F1*F1-F2: %s%n", (f1.times(f1).minus(f2)));
		
	}

}
