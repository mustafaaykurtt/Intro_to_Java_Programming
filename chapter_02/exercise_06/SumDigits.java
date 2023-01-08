package chapter_02.exercise_06;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 100: ");
		
		int number = input.nextInt();
		int onesDigit = number % 10;
		int tenDigits = number % 100 / 10;
		int hundredDigits = number / 100;
		
		System.out.println(onesDigit + tenDigits + hundredDigits );
	}

}
