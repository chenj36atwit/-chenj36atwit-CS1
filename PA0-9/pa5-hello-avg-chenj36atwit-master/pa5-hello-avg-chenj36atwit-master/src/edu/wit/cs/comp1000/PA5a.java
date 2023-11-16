package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA5a {

	// TODO: document this method
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input message: ");
		
		String scan = input.nextLine();
		
		for(int i = 0; i < scan.length(); i++) {
			char c = scan.charAt(i);
			
			if(c == 'L' || c == 'l') {
				l();
			}
			if(c == 'd' || c == 'D') {
				d();	
			}
			if(c == 'H' || c == 'h') {
				h();
			}
			if(c == 'E' || c == 'e') {
				e();
			}
			if(c == 'O' || c == 'o') {
				o();
			}
			if(c == 'R' || c == 'r') {
				r();
			}
			if(c == ' ' || c == ' ') {
				Blank();
			}
			if(c == 'W' || c == 'w') {
				w();
			}
		}
	}
	
	public static void d() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println(" *   * ");
		System.out.println("  ***  ");
		System.out.println();

	}
	
	public static void e() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*  *  *");
		System.out.println("*  *  *");
		System.out.println("*  *  *");
		System.out.println("*  *  *");
		System.out.println();
	}
	
	public static void h() {
		System.out.println();
		System.out.println("*******");
		System.out.println("   *   ");
		System.out.println("   *   ");
		System.out.println("   *   ");
		System.out.println("*******");
		System.out.println();
	}
	
	public static void l() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*      ");
		System.out.println("*      ");
		System.out.println("*      ");
		System.out.println("*      ");
		System.out.println();
	}
	
	public static void o() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*     *");
		System.out.println("*******");
		System.out.println();
	}
	
	public static void r() {
		System.out.println();
		System.out.println("*******");
		System.out.println("   *  *");
		System.out.println("  **  *");
		System.out.println(" * ****");
		System.out.println("*      ");
		System.out.println();
	}
	
	public static void w() {
		System.out.println();
		System.out.println("*******");
		System.out.println("*      ");
		System.out.println("****   ");
		System.out.println("*      ");
		System.out.println("*******");
		System.out.println();
	}
	
	public static void Blank() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	

}
