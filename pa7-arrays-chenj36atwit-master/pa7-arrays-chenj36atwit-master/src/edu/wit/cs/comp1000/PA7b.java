package edu.wit.cs.comp1000;

import java.io.*;
import java.util.Scanner;

//TODO: document this class
public class PA7b {

	/**
	 * Program execution point:
	 * input text via console input,
	 * output counts for each letter
	 * found in the input (case-insensitive)
	 * 
	 * @param args command-line arguments (ignored)
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.print("Enter text: ");
		 
		 String s=scan.nextLine();
		 
		 int i = 0;
		 
		 int arr[] = new int[26];
		
		 for(i = 0; i < 26 ;i++) {
			 arr[i] = 0;
		 }
	
		 for(i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
		 
			 if(ch >= 'A' && ch <= 'Z') {
				 arr[ch-'A']++;
			 }
			 else if(ch >= 'a' && ch <= 'z') {
				 arr[ch-'a']++;
			 }
		 
		 }

		 for(i = 0; i < 26; i++) {
		 
			 if(arr[i] > 0) {

				 System.out.println((char)(i + 'A')+": "+arr[i]);
				 
			 }
		 }
	}
}


