package chapter_04.exercise_13;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter");
		String str = input.next();
		
		char ch = str.toUpperCase().charAt(0);
		
		if ('A' <= ch && ch <= 'Z') {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
				System.out.println(ch + " is a vowel");
			}else {
				System.out.println(ch + " is a consonant");
			}
		}else {
			System.out.println("Wrong entry");
		}
	}
}
