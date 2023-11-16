package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA3a {

	// Jacky chen was here 10/27/2021
	public static void main(String[] args) {
		
		double a, b, c;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of side a: ");
		a = input.nextDouble();
		System.out.print("Enter the length of side b: ");
		b = input.nextDouble();
		System.out.print("Enter the length of side c: ");
		c = input.nextDouble();
		
		double s = (a + b + c)/2;
		
		if(a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Side lengths must all be positive");
		}
		
		else if(a > 0|| b > 0 || c > 0) {
			
			if(a + b > c && a + c > b && b + c > a) {
				Double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
				System.out.printf("The area is %.2f%n",area);
			}
			else if(a + b <= c){
				System.out.println("Side c is too long");
			}
			else if(a + c <= b){
				System.out.println("Side b is too long");
			}
			else if(b + c <= a){
				System.out.println("Side a is too long");
			}
			
		}
		
	}

}
