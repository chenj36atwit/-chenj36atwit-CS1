package edu.wit.cs.comp1000;

import java.util.Scanner;

// Jacky Chen was here 9/24/2021 //pass on 9/29/2021
public class PA2a {
	
	// TODO: document this function
	public static void main(String[] args) {
		
		int positive_count = 0;
		int non_positive_count = 0;
		
		int positive_sum = 0;
		int non_positive_sum = 0;
		
		int num1, num2, num3, num4, num5;
	
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		System.out.print("Enter five whole numbers: ");
		
			if(num1 > 0) {
				positive_count++;
				positive_sum = positive_sum+num1;
			}
			if(num2 > 0) {
				positive_count++;
				positive_sum = positive_sum+num2;
			}
			if(num3 > 0) {
				positive_count++;
				positive_sum = positive_sum+num3;
			}
			if(num4 > 0) {
				positive_count++;
				positive_sum = positive_sum+num4;
			}
			if(num5 > 0) {
				positive_count++;
				positive_sum = positive_sum+num5;
			}
			if(num1 <= 0) {
				non_positive_count++;
				non_positive_sum = non_positive_sum+num1;
			}
			if(num2 <= 0) {
				non_positive_count++;
				non_positive_sum = non_positive_sum+num2;
			}
			if(num3 <= 0) {
				non_positive_count++;
				non_positive_sum = non_positive_sum+num3;
			}
			if(num4 <= 0) {
				non_positive_count++;
				non_positive_sum = non_positive_sum+num4;
			}
			if(num5 <= 0) {
				non_positive_count++;
				non_positive_sum = non_positive_sum+num5;
			}
			
			double a = positive_sum;
			double b = non_positive_sum;
			
			int totalsum = num1+num2+num3+num4+num5;
	
				double totalavgnum = ((a+b)/(positive_count+non_positive_count));
				
				if(positive_count == 1) {
					System.out.printf("The sum of the %d positive number: %d%n",positive_count,positive_sum);
				}
				else if(positive_count == 0) {
					System.out.printf("The sum of the %d positive numbers: %d%n",positive_count,positive_sum);
				}
				else {
					System.out.printf("The sum of the %d positive numbers: %d%n",positive_count,positive_sum);
				}
				if(non_positive_count == 1) {
					System.out.printf("The sum of the %d non-positive number: %d%n",non_positive_count,non_positive_sum); 
				}
				else if(non_positive_count == 0) {
					System.out.printf("The sum of the %d non-positive numbers: %d%n",non_positive_count,non_positive_sum); 
				}
				else {
					System.out.printf("The sum of the %d non-positive numbers: %d%n",non_positive_count,non_positive_sum); 
				}
				
				System.out.printf("The sum of the 5 numbers: %d%n",totalsum);
				
				if(positive_count == 1) {
					double avgp = (a/positive_count);
					double c = avgp;
					System.out.printf("The average of the %d positive number: %.2f%n",positive_count,c);
				}
				else if(positive_count == 0 && positive_sum == 0) {
					double p = positive_count;
					System.out.printf("The average of the %d positive numbers: %.2f%n",positive_count,p); 
				}
				else {
					double avgp = (a/positive_count);
					double c = avgp;
					System.out.printf("The average of the %d positive numbers: %.2f%n",positive_count,c);
				}
				if(non_positive_count == 1) {
					double avgnp = (b/non_positive_count);
					double d = avgnp;
					System.out.printf("The average of the %d non-positive number: %.2f%n",non_positive_count,d);
				}
				else if(non_positive_count == 0 && non_positive_sum == 0) {
					double p = non_positive_count;
					System.out.printf("The average of the %d non-positive numbers: %.2f%n",non_positive_count,p); 
				}
				else {
					double avgnp = (b/non_positive_count);
					double d = avgnp;
					System.out.printf("The average of the %d non-positive numbers: %.2f%n",non_positive_count,d);
				}
				
				System.out.printf("The average of the 5 numbers: %.2f%n",totalavgnum);
			
	}

}
