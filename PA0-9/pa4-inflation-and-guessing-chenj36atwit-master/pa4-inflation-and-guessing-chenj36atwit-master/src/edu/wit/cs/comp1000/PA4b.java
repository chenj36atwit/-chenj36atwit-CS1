package edu.wit.cs.comp1000;

import java.util.Random;

import java.util.Scanner;

//TODO: document this class
public class PA4b {

	// TODO: document this method
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//////////////////////////////////////////////////////////////////////////////
		// DO NOT CHANGE IN FINAL SUBMISSION
		//////////////////////////////////////////////////////////////////////////////
		
		Long seed;
		if (args.length != 1) {
			seed = null; // you can temporarily change this to assist in debugging
			             // the value must end in L, such as 1070L
		} else {
			seed = Long.valueOf(args[0]);
		}
		
		// Gets a random number between 1 and 100
		// Use the target variable as the correct answer for guessing
		Random random;
		if (seed == null) {
			random = new Random();
		} else {
			random = new Random(seed);
		}
		int target = (Math.abs(random.nextInt()) % 100) + 1;
		
		//////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////
		
		// It might be useful to see the correct answer
		
		int input_value;
		do {
			System.out.print("Enter your guess (between 1 and 100): ");
			input_value = input.nextInt();
			if (input_value < 1 || input_value > 100) {
				System.out.println("Invalid guess, try again!");
				continue;
			}
			if (target < input_value) {
				System.out.println("Too high!");
			}
			else if (target > input_value) {
				System.out.println("Too low!");
			}
		} while (target != input_value);
		System.out.println("You win!");
	}
	
}
