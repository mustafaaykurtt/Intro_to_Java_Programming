package chapter_07.exercise_09;

import java.util.Scanner;

public class FindTheSmallestElement {
	public static void main(String[] args) {
		int[] numbers = new int[5];

		int smallestNumber = smallestNumber(numbers);
		System.out.println(smallestNumber);

	}

	private static int smallestNumber(int[] numbers) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers:");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		return smallest(numbers);
	}

	private static int smallest(int[] array) {
		int smallestNumber = array[0];
		for (int i = 0; i < array.length; i++) {

			if (smallestNumber > array[i]) {
				smallestNumber = array[i];
			}
		}
		return smallestNumber;
	}
}
