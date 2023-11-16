package edu.wit.cs.comp1000;

//jacky chen was here 10/15/2021

import java.util.Scanner;

public class LA2a {

	public static void main(String[] args) {
		
		double a, b;
		
		double area;
		
		double perimeter;
		
		double interior_angle;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of sides: ");
		a = input.nextDouble();
		System.out.print("Enter side length: ");
		b = input.nextDouble();
		
		if(a < 3){
			System.out.println("A polygon must have at least 3 sides.");
		}
		if(b <= 0){
			System.out.println("Side length must be positive.");
		}
		
		if(a >= 3 && b > 0) {
			area = (Math.pow(b, 2) * a)/(4 * Math.tan(Math.PI/a));
			System.out.printf("Area: %.3f%n",area);
			
			Math.toRadians(a);
			Math.toRadians(b);
			
			perimeter = a * b;
			
			interior_angle = 180 - (360/a);
			
			System.out.printf("Perimeter: %.3f%n",perimeter);
			System.out.printf("Interior Angle: %.3f degrees%n",interior_angle);
		}
	}

}
