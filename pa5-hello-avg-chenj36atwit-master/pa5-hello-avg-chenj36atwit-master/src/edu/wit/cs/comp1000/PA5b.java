package edu.wit.cs.comp1000;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PA5b {
	
	 static double average;

	//jakcy Chen was here 11/9/2021
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        String userChoice;

        do{
             
            	 System.out.print("Enter a stream of non-negative numbers (negative when finished): ");
            	 average = getMathWork(input);
            	 System.out.printf("The average is: %.2f%n", average);
                 System.out.print("Do you want to compute another average (y/n)? ");
            	
            	 userChoice = input.next().toLowerCase();
            	 
        }while(userChoice.equals("y")) ;
 
 }

 public static double getMathWork(Scanner input){
	 
	 	double Value;
        double numofNumbers;
        double average;
        double total;

        average = 0;
        numofNumbers= 1;
        total = 0;

        do{
           
        	Value = input.nextDouble();
        	
            if(Value >= 0){
            	   
            	total = total + Value;
                average = total / numofNumbers;
                numofNumbers = numofNumbers + 1;
            }

        }while (Value>= 0);
        
        return average;
	}

}
