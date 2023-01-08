package chapter_11.exercise_16;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			ArrayList<Integer> list = new ArrayList<>();
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			System.out.print(number1 + "+" + number2 + " = ?");

			int sum = number1 + number2;
			int answer = input.nextInt();
			if (answer == sum) {
				System.out.println("You know!");
			} else {
				control(list, sum, answer, input);
			}
		}
	}

	private static void control(ArrayList<Integer> list, int sum, int answer, Scanner input) {
		while (sum != answer) {
			if (list.contains(answer)) {
				System.out.print("You have given this answer before, try again:");
			} else {
				System.out.print("Try again:");
				list.add(answer);
			}
			answer = input.nextInt();
		}
		System.out.println("You know!");
	}
}
