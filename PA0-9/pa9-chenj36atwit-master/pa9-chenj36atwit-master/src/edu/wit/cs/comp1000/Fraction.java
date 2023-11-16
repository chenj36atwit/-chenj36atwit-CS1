package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class Fraction {
	
	 private int numerator;
	 private int denominator;
	
	/**
	 * Error to output if denominator is zero
	 */
	private static final String E_DEN_ZERO = "Denominator cannot be zero.";
	
	/**
	 * Error to output if dividing by zero
	 */
	private static final String E_DIV_ZERO = "Cannot divide by zero.";
	
	/**
	 * Returns the greatest common divisor (gcd) of two integers
	 * 
	 * @param num1 integer 1
	 * @param num2 integer 2
	 * @return gcd of integers 1 and 2
	 */
	private static int gcd(int num1, int num2) {
		int t;
		while (num2 != 0) {
			t = num2;
			num2 = num1 % num2;
			num1 = t;
		}
		
		return num1;
	}
	
	/**
	 * Returns the simplified form of a fraction
	 * 
	 * @param f fraction (numerator=[0], denominator=[1])
	 * @return simplified fraction (numerator=[0], denominator=[1])
	 */
	private static int[] simplifyFraction(int[] f) {
		final int gcd = gcd(f[0], f[1]);
		int[] result = {f[0]/gcd, f[1]/gcd};
		
		if ((result[0]<0 && result[1]<0) || (result[1]<0)) {
			result[0] = -result[0];
			result[1] = -result[1];
		}
		
		return result;
	}
	
	/**
	 * Constructs a fraction given a numerator/denominator
	 * 
	 * If denominator = 0, exit with message
	 * 
	 * @param n numerator
	 * @param d denominator
	 */
	public Fraction(int n, int d) {
		setFraction(n, d);
	}
	
	/**
	 * Constructs a fraction as 0/1
	 */
	public Fraction() {
		
		numerator = 0;
		denominator = 1;
		
	}
	
	private void setFraction(int num, int den) {
		
		if (den == 0)
			throw new ArithmeticException();
		
		if(den < 0){
		if(num < 0){
			den *= -1;
			num *= -1;
		}
		else{
			den *= -1;
			num *= -1;
		}
		}
			numerator = num;
			denominator = den;
	}

	
	/**
	 * Constructs a fraction given input from a supplied Scanner
	 * 
	 * If denominator = 0, exit with message
	 * 
	 * @param s scanner from which to read fraction components
	 */
	public Fraction(Scanner s) {
		
		System.out.print("Enter numerator: ");
		numerator = s.nextInt();
		System.out.print("Enter denominator: ");
		denominator = s.nextInt();
		
	}
	
	/**
	 * Gets the decimal value of a fraction
	 * 
	 * @return decimal version
	 */
	public double toDecimal() {
		
		 return (double) numerator / denominator;
		 
	}
	
	/**
	 * Returns the string value of a fraction:
	 * - if denominator is 1, "numerator"
	 * - else, "numerator/denominator (decimal with three decimal places)"
	 * 
	 * @return string formatted fraction
	 */
	public String toString() {
		
		if(denominator == 1){
			return String.format("%d (%.3f)", numerator, toDecimal());
		}
		
		else{
			return String.format("%d/%d (%.3f)", numerator, denominator, toDecimal());
		  }
		
	}
	
	/**
	 * Gets the fraction numerator
	 * 
	 * @return numerator
	 */
	public int getNumerator() {
		
		return numerator;
		
	}
	
	/**
	 * Gets the fraction denominator
	 * 
	 * @return denominator
	 */
	public int getDenominator() {
		
		 return denominator;
		 
	}
	
	/**
	 * Adds a fraction to this fraction
	 * 
	 * @param f fraction to add
	 * @return a new fraction that sums this and the supplied parameter
	 */
	public Fraction plus(Fraction f) {
		
		Fraction newone = new Fraction((numerator * ((Fraction) f).denominator)
			+ (denominator * ((Fraction) f).numerator),
			denominator * ((Fraction) f).denominator);
			newone.simplifyFraction();
			return newone;
			
	}
	
	/**
	 * Subtracts a fraction from this fraction
	 * 
	 * @param f fraction to subtract
	 * @return a new fraction that results from subtracting the supplied parameter from this
	 */
	public Fraction minus(Fraction f) {
		
		Fraction newone = new Fraction((numerator * ((Fraction) f).denominator) - (denominator * ((Fraction) f).numerator),
			denominator * ((Fraction) f).denominator);
			newone.simplifyFraction();
			return newone;
			
	}
	
	/**
	 * Multiplies a fraction with this fraction
	 * 
	 * @param f fraction to multiply
	 * @return a new fraction that is the product of this and the supplied parameter
	 */
	public Fraction times(Fraction f) {
		
		Fraction newone = new Fraction((numerator * ((Fraction) f).numerator),
			denominator * ((Fraction) f).denominator);
			newone.simplifyFraction();
			return newone;
			
	}
	
	/**
	 * Divides a fraction into this fraction
	 * 
	 * @param f fraction with which to divide
	 * @return a new fraction that is the quotient of this and the supplied parameter
	 */
	public Fraction divides(Fraction f) {
		
		 Fraction newone = new Fraction((numerator * ((Fraction) f).denominator),
			denominator * ((Fraction) f).numerator);
			newone.simplifyFraction();
		    return newone;
		    
	}
	
	public void simplifyFraction() {
		
		boolean neg = false;
		
		if(numerator == -1){
			numerator *= -1;
			neg = true;
		}
		int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
			numerator = numerator / gcd;
			denominator = denominator / gcd;
		if(neg == true){
			numerator *= -1;
		}
	}


}
