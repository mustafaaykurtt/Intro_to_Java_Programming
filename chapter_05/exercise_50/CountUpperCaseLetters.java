package chapter_05.exercise_50;

import java.util.Scanner;

public class CountUpperCaseLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = input.nextLine();

		int endIndex = str.length();
		int i = 0;
		int countLetter = 0;

		boolean isUpper = false;
		while (i < endIndex) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				isUpper = true;
				countLetter++;
			}
			i++;
		}

		if (isUpper) {
			System.out.println(countLetter);
		} else {
			System.out.println("No capital letters.");
		}
	}
}
