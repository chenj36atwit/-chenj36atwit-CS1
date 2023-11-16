package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA4a {

	// TODO: document this method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the current price of the item: $");
        double cp = input.nextDouble();

        System.out.print("Enter the number of years: ");
        double y = input.nextInt();
        
        System.out.print("Enter the inflation rate as a percentage: ");
        double f = input.nextDouble();
        
        if(cp < 0) {
        	System.out.println("The current price must be at least 0!");
        	System.exit(0);
        }
        
        if(f < 0) {
        	System.out.println("The inflation rate must be at least 0!");
        	System.exit(0);
        }
        
        if(y < 0) {
        	System.out.println("The number of years must be at least 0!");
        	System.exit(0);
        }
        
        int count = 0;
        
        while (count < y) {
        	cp = cp*(1+f/100);
        	count++;
        }
        if (y == 1) {
        	System.out.printf("After %.0f year, the price will be $%.2f%n",y,cp);
        }
        else {
        	System.out.printf("After %.0f years, the price will be $%.2f%n",y,cp);
        }
       
	}
        
}  
      
  
