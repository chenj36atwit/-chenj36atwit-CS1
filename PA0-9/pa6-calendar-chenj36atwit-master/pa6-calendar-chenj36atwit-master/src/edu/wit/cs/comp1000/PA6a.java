package edu.wit.cs.comp1000;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

// TODO: document this class
public class PA6a {
	/**
	 * Error to output if year is not positive
	 */
	static final String E_YEAR = "The year must be positive!";
	
	/**
	 * Error to output if the day is not between 0 and 6
	 */
	static final String E_DAY = "The day of January 1st must be between 0 and 6!";
	
	/**
	 * Determines if an input is a leap year
	 * 
	 * @param year year in question
	 * @return true if a leap year
	 */
	public static boolean isLeapYear(int year) {
		
		boolean isLeap = false;
		 
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			isLeap = true;
		}
		
		else {
			isLeap = false;
		}
		return isLeap;
	}
	
	/**
	 * Outputs a month to the console
	 * 
	 * @param y title
	 * @param startDay 0=Sunday ... 6=Saturday
	 * @param numDays number of days in the month
	 * @return day of the week after the last day of the month
	 */
	public static int printMonth(String month, int startDay, int numDays) {
		
		System.out.println(month);
		
		for (int i = 0; i < startDay; i++) {
			System.out.print("   ");
		}
		
		for (int i = 1; i <= numDays; i++) {
			System.out.printf("%3d", i);
			if ((i + startDay) % 7 == 0 || i == numDays) {
				System.out.println();
			}
		}
		System.out.println();
		return (numDays + startDay) % 7;
	}

	/**
	 * Program execution point:
	 * input year, day of the week (0-6) of january 1
	 * output calendar for that year
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the day of the week of January 1st (0=Sunday, 1=Monday, ... 6=Saturday): ");
		int day = input.nextInt();
		
		if (year < 0) {
			System.out.println(E_YEAR);
			System.exit(0);
		}
		
		if (day < 0 || day > 6) {
			System.out.println(E_DAY);
			System.exit(0);
		}
		
		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		int[] numDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for (int i = 0; i < 12; i++) {
			if(isLeapYear(year) && month[i].contentEquals("February")) {
				numDays[i] = 29;
			}
			day = printMonth(month[i], day, numDays[i]);
		}
		
	}
}

