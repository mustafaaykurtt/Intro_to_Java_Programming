package chapter_05.exercise_14;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int number1 = input.nextInt();
		System.out.println("Enter number 2:");
		int number2 = input.nextInt();
		int gcd = 0;
		
		if(number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		int divide = number2;
		while (number2 > 1) {
			if (number1 % number2 == 0 && divide % number2 == 0) {
				gcd = number2;
				break;
			}
			number2--;
		}
		System.out.println(gcd);
	}
}
