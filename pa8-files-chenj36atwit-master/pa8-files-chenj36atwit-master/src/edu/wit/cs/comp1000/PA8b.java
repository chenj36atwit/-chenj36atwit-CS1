package edu.wit.cs.comp1000;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//TODO: document this class
public class PA8b {
	
	public static void readWords(String s) {
		
		try {
			
			Scanner inFile = new Scanner(new FileReader(s));
			
			int min=Integer.MAX_VALUE;
			int max = 0;
			int mean = 0;
			
		while (inFile.hasNextLine()) {
			
			Scanner inLine = new
			Scanner(inFile.nextLine());
			
		while (inLine.hasNext()) {
			
			int num = Integer.parseInt(inLine.next().trim());
			
			if(num > max) {
				
				max = num;
			}
			
			if(num < min) {
				
				min=num;
			}
		}
		}
		mean = (max+min)/2;
		
		System.out.println("File: [ "+min+" , " + max+" ]");
		
		System.out.println();
		
		} 
		catch (FileNotFoundException ex) {
			
			ex.printStackTrace();
		}
	}
	/**
	 * Program execution point:
	 * input an input file name,
	 * output the smallest and largest
	 * integers found in the file (or invalid
	 * if not only integers in the file)
	 * 
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s;
		System.out.print("Enter the name of the input file: ");
		s = input.nextLine();
		readWords(s);
	}

}
