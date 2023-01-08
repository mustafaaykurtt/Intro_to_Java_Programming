package chapter_06.exercise_37;

import java.util.Scanner;

public class FormatInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number and width:");
		String str = input.next();
		int width = input.nextInt();

		System.out.println(	format(str , width));
	}

	private static String format(String str, int i) {
		int length = str.length();
		int numberOfZero = i - length;
		String str1 = "";
		
		for(int j = 0; j < numberOfZero; j++) {
			str1 += 0;
		}
		if (i > length) {
			return str1 + str;	
		} else {
			return str;
		}
	}
	
}
