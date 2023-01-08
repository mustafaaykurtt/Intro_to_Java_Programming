package chapter_04.exercise_09;

import java.util.Scanner;

public class FindUnicodeCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character");
		String str = input.next();
		
		char a = str.charAt(0);
		System.out.println((int) a);
	}

}
