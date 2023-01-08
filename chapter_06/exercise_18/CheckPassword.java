package chapter_06.exercise_18;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter password:");
		String password = input.next();

		 displayPassword(password);
	}

	public static void displayPassword(String password) {
		int length = password.length();

		if (length < 8) {
			System.out.println("No less than 8 characters can be entered!");
			return ;
		} else {
			control( password , length);
		}
	}

	public static void control(String password, int length) {
		int i = 0;
		int countNumber = 0;
		int countLetter = 0;
		
		while (i < length) {
			char ch = password.toUpperCase().charAt(i);
			
			if (Character.isDigit(ch)) {
				countNumber++;
			}
			if (Character.isLetter(ch)) {
				countLetter++;
			}
			i++;
		}
		
		if (countNumber > 1 && countLetter > 1 && i == countNumber + countLetter ) {
			System.out.println("Valid password");
		} else if(i > countNumber + countLetter){
			System.out.println("Invalid character input!");
		} else {
			System.out.println("Please pay attention to the number of letters and numbers!");
		}
	}

}
