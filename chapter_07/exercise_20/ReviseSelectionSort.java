package chapter_07.exercise_20;

import java.util.Scanner;

public class ReviseSelectionSort {
	public static void main(String[] args) {
		int[] array = new int[10];

		entryArray(array);
		sortArray(array);
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void sortArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int temp = array[array.length - 1];
		array[array.length - 1] = array[0];
		array[0] = temp;
	}

	private static void entryArray(int[] array) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

	}
}
