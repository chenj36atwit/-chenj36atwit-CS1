package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA3b {

	//Jacky Chen was here 10/27/2021
	public static void main(String[] args) {
		
		int x, y;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your birth month (1-12): ");
		x = input.nextInt();
		System.out.print("Enter your birth day (1-31): ");
		y = input.nextInt();
		
		if(x <= 12 && x >= 1 && y <= 31 && y >= 1) {
			if(x == 1) {
				if(y <= 19) {
					System.out.println("You are a Capricorn!");
					System.out.println("HII You did it!");
				}
				else if(y >= 20) {
					System.out.println("You are an Aquarius!");
					System.out.println("Do you like water?");
				}
			}
			else if(x == 2) {
				if(y <= 18) {
					System.out.println("You are an Aquarius!");
					System.out.println("Do you like water?");
				}
				else if(y >= 19) {
					System.out.println("You are a Pisces!");
					System.out.println("Pikes or Pizza?");
				}
			}
			else if(x == 3) {
				if(y <= 20) {
					System.out.println("You are a Pisces!");
					System.out.println("Pikes or Pizza?");
				}
				else if(y >= 21) {
					System.out.println("You are an Aries!");
					System.out.println("Be Princess?");
				}
			}
			else if(x == 4) {
				if(y <= 19) {
					System.out.println("You are an Aries!");
					System.out.println("Be Princess?");
				}
				else if(y >= 20) {
					System.out.println("You are a Taurus!");
					System.out.println("I am a Bull");
				}
			}
			else if (x == 5) {
				if(y <= 20) {
					System.out.println("You are a Taurus!");
					System.out.println("I am a Bull");
				}
				else if(y >= 21) {
					System.out.println("You are a Gemini!");
					System.out.println("A rare Gem indeed!");
				}
			}
			else if(x == 6) {
				if(y <= 21) {
					System.out.println("You are a Gemini!");
					System.out.println("A rare Gem indeed!");
				}
				else if(y >= 22) {
					System.out.println("You are a Cancer!");
					System.out.println("Get well soon!");
				}
			}
			else if(x == 7) {
				if(y <= 22) {
					System.out.println("You are a Cancer!");
					System.out.println("Get well soon!");
				}
				else if(y >= 23) {
					System.out.println("You are a Leo!");
					System.out.println("Roar!");
				}
			}
			else if(x == 8) {
				if(y <= 22) {
					System.out.println("You are a Leo!");
					System.out.println("Roar!");
				}
				else if(y >= 23) {
					System.out.println("You are a Virgo!");
					System.out.println("Your V-card?");
				}
			}
			else if(x == 9) {
				if(y <= 22) {
					System.out.println("You are a Virgo!");
					System.out.println("Your V-card?");
				}
				else if(y >= 23) {
					System.out.println("You are a Libra!");
					System.out.println("Want money or go to the library?");
				}
			}
			else if(x == 10) {
				if(y <= 22) {
					System.out.println("You are a Libra!");
					System.out.println("Want money or go to the library?");
				}
				else if(y >= 23) {
					System.out.println("You are a Scorpio!");
					System.out.println("Ouch!");
				}
			}
			else if(x == 11) {
				if(y <= 21) {
					System.out.println("You are a Scorpio!");
					System.out.println("Ouch!");
				}
				else if(y >= 22) {
					System.out.println("You are a Sagittarius!");
					System.out.println("Look a Arrow!");
				}
			}
			else if(x == 12) {
				if(y <= 21) {
					System.out.println("You are a Sagittarius!");
					System.out.println("Look a Arrow!");
				}
				else if(y >= 22) {
					System.out.println("You are a Capricorn!");
					System.out.println("HII You did it!");
				}
			}
		}
		else if(x > 12 || x < 1) {
			System.out.println("Month must be between 1 and 12!");
		}
		else if(y > 31 || y < 1){
			System.out.println("Day must be between 1 and 31!");
		}
		
	}

}
