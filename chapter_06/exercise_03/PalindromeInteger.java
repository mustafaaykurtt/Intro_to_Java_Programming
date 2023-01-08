package chapter_06.exercise_03;

import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		String number = input.next();
		
		if(isPalindrome(number)) {
			System.out.println("is a palindrome");
		} else {
			System.out.println("is not a palindrome");
		}
	}

	private static boolean isPalindrome(String number) {
		
		int length = number.length() -1;
		String reverse = "";
		
		while(length >= 0) {
			char ch = number.charAt(length);
			reverse += ch;
			
			length--;
		}
		
		if(number.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
