package edu.wit.cs.comp1000;

//Jacky Chen was here 9/24/2021 //pass on 9/29/2021

import java.util.Scanner;

public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		
		double num1, num2, num3;
		
		double mathequation;
		
		double root1, root2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a b c: ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		mathequation = Math.pow(num2,2) - 4*(num1*num3);
		
		if(mathequation < 0) {
			System.out.println("Roots: imaginary");
		}
		else if(mathequation == 0) {
			root1 = (-num2/2*num1);
			System.out.printf("Root: %.2f%n",root1);
		}
		if(mathequation > 0) {
			double determinant = num2 * num2 - 4 * num1 * num3;
			
			root1 = (-num2 + Math.sqrt(determinant)) / (2 * num1);
		    root2 = (-num2 - Math.sqrt(determinant)) / (2 * num1);
		    
		    if(root1 > root2) {
		    	System.out.printf("Roots: %.2f, %.2f%n",root2,root1);
		    }
		    else {
		    	System.out.printf("Roots: %.2f, %.2f%n",root1,root2);
		    }
		}
	}

}
