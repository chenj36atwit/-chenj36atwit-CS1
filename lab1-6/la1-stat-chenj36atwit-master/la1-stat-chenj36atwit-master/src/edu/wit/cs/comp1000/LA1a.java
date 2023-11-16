package edu.wit.cs.comp1000;

import java.util.Scanner; //Jacky Chen was here 10/8/2021

public class LA1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1, num2, num3, num4, num5;
		double ptotals = 0;
		double nptotals = 0;
		
		System.out.print("Enter five numbers: ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		num4 = input.nextDouble();
		num5 = input.nextDouble();
		
		double totalsum = num1+num2+num3+num4+num5;
		
		double mean = totalsum/5;
		
		double deviation1 = ((Math.pow((num1-mean),2) + Math.pow((num2-mean),2) + Math.pow((num3-mean),2) + Math.pow((num4-mean),2) + Math.pow((num5-mean),2))/5);
				
		double deviationfinal = Math.sqrt(deviation1);
		
		System.out.printf("Sum: %.2f%n",totalsum);
		System.out.printf("Mean: %.2f%n",mean);
		System.out.printf("Population Standard Deviation: %.2f%n",deviationfinal);
		
	}

}
