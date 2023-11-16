package edu.wit.cs.comp1000;

import java.util.Scanner;
import java.util.Arrays;

//jacky chen was here 11/25/2021
public class PA7a {
	
	/**
	 * Reads all values from the provided scanner
	 * into the supplied array (up to its size)
	 * and returns the number of integers read
	 * 
	 * @param input input source
	 * @param nums destination for read integers
	 * @return number of integers read
	 */
	public static int readIntoArray(Scanner input, int[] nums) {

		int num_values = 0;
		
		System.out.print("Enter up to 100 integers: ");
		
		try {

			while(input.hasNextInt() || num_values < nums.length) {

				nums[num_values] = input.nextInt();
				num_values++;
			}
		}
		catch (Exception e) {
			
		}
	
		return num_values;
	}
	
	/**
	 * Prints to the screen the average of the supplied array,
	 * up to the supplied size, and all integers in the array, 
	 * again up to the supplied size, that are larger than the average
	 * 
	 * @param nums array of numbers
	 * @param size number of valid elements
	 */
	public static void printAboveAverage(int[] nums, int size) {
		
		double sumOfValues = 0;
		
        for (int i = 0; i < size; i++)
			sumOfValues += nums[i];
		
		double avgOfArr = sumOfValues/size;
		
		System.out.println("Average: "+sumOfValues);
		
		System.out.println("Values above average:"+avgOfArr);
		
		for(int i = 0; i < size; i++) {

		if(nums[i] > avgOfArr)

		System.out.println("Array["+i+"]"+" = " +nums[i]);
		
		}
		
	}

	/**
	 * Program execution point:
	 * input a sequence of integers (up to 100),
	 * output average of integers and those over the average
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] nums = new int[100];

		int countOfInt = readIntoArray(input, nums);

		printAboveAverage(nums, countOfInt);
		
	}

}
