package edu.wit.cs.comp1000;

// Jacky Chen 9/17/2021

import java.util.Scanner;

public class PA1b {
	
	// User input from inches to y,g,i
	public static void main(String[] args) {
		
			System.out.print("Enter number of inches: ");
			
			Scanner input = new Scanner(System.in);
			
			//math work below here
			int value = input.nextInt();
			int yard = value/36;
			int yardRemainder = value%36;
			int feet = yardRemainder/12;
			int feetRemainder = yardRemainder%12;
			int inches = feetRemainder;
			
			System.out.printf("Yards: %d%nFeet: %d%nInches: %d%n",yard,feet,inches); //print out solution to user
	}
}


