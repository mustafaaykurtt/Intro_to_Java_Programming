package chapter_12.exercise_06;

import java.util.Scanner; 

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		while (true) {
			String hex = input.next();
			try {
				int dec = hexToDec(hex.toUpperCase());
				System.out.println(dec);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Try again: ");
			}
		}
	}

	public static int hexToDec(String hex) {
		int stepValue = 1;
		int dec = 0;

		for (int i = hex.length() - 1; 0 <= i; i--) {
			char ch = hex.charAt(i);
			if (!(ch >= 'A' && ch <= 'F') && !(ch >= '0' && ch <= '9')) {
				throw new NumberFormatException("String is not a hex string");
			} else {
				char hexChar = hex.charAt(i);
				int numberValue = hexCharToDec(hexChar);
				dec += numberValue * stepValue;
				stepValue *= 16;
			}
		}
		return dec;
	}

	public static int hexCharToDec(char ch) {
		if ('A' <= ch && ch <= 'F') {
			return ch - 'A' + 10;
		} else {
			return ch - '0';
		}
	}
}
