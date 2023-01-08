package chapter_03.exercise_02;

import java.util.Scanner;

public class SumThreeNumbers {
	public static void main(String[] args) {
		
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);
		int sum = number1 + number2 +number3;

		System.out.println(number1 + " + " + number2 + " + " + number3 + " = ?" );
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your answer: ");
		int answer = input.nextInt();
		
		if (sum == answer) {
			System.out.println("True");
		}else {
			System.out.println("Wrong");
		}
	}
}
