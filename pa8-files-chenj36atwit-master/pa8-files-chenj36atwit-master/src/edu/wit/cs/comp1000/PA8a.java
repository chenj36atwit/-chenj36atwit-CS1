package edu.wit.cs.comp1000;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//TODO: document this class
public class PA8a {
	
	/**
	 * Error to output when a file cannot be opened.
	 */
	static final String E_NOT_FOUND = "Error! File not found!";
	
	/**
	 * Reads all integers in input scanner,
	 * outputs positive ones to output each on
	 * its own line
	 * 
	 * @param input input source
	 * @param output output destination 
	 */
	public static void process(Scanner input, PrintWriter output) {
		
		String l;

		while(input.hasNextLine()) {

			l = input.nextLine();  

			if(Integer.parseInt(l) > 0) {

				output.println(l);

		}

		}

		output.flush();

		output.close();

	}

	/**
	 * Program execution point:
	 * input an input file name and an output file name,
	 * for each positive number in the input file 
	 * print on its own line to the output file
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		
		String IN,OUT;    

		Scanner x = new Scanner(System.in);

		System.out.print("Enter the name of the input file: ");

		IN = x.next();

		System.out.print("Enter the name of the output file: ");

		OUT= x.next();

		try {

			Scanner input = new Scanner(new File(IN));

			PrintWriter output = new PrintWriter(new File(OUT));

			process(input, output);

		}

		catch (Exception ex) {

			System.out.println(E_NOT_FOUND);

		}
	}

}
