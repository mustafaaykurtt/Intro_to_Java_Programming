package chapter_07.exercise_14;

import java.util.Scanner;

public class ComputingGcd {
	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.println(gcd(array));

	}

	private static int gcd(int[] array) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 5 numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();

		}

		return calculateGcd(array);
	}

	private static int calculateGcd(int... array) {
		int gcd = 1;
		boolean divider;

		for (int i = 2; i < min(array) + 1; i++) {
			divider = true;
			for (int j = 0; j < array.length; j++) {
				if (array[j] % i != 0) {
					divider = false;
				}
			}
			if (divider) {
				gcd = i;
			}

		}
		return gcd;
	}

	private static int min(int[] array) {
		int min = array[0];
		for (int i : array) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}
}
