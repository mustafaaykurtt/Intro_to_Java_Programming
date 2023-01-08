package chapter_03.exercise_10;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 101);
		int number2 = (int) (Math.random() * 101);

		System.out.println(number1 + " + " + number2 + " + ?");
		int sum = number1 + number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter answer: ");
		int answer = input.nextInt();
		
		if (sum == answer) {
			System.out.println("Your answer is true.");
		} else {
			System.out.println("It is wrong");
		}

	}

}
