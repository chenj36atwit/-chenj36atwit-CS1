package edu.wit.cs.comp1000;

import java.util.Scanner;

// Jacky Chen 9/17/2021
public class PA1a {
	
	// yards, feet, and inches convert to inches
	public static void main(String[] args) {
		
		int feet;
		int yard;
		int inches;
		
		Scanner in = new Scanner(System.in);
		
		//math work 
		yard = in.nextInt();
		int a = yard * 36;
		
		feet = in.nextInt();
		int b = feet * 12;
		
		inches = in.nextInt();
		int c = inches;
		
		int totalResult = a + b + c;
		
		System.out.println("Enter number of yards: Enter number of feet: Enter number of inches: Total number of inches: " +totalResult); //print out solution to user
	}

}
