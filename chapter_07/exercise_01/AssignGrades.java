package chapter_07.exercise_01;

import java.util.Scanner;

public class AssignGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array length:");
		int numberOfStudent = input.nextInt();

		int[] array = new int[numberOfStudent];

		displayUser(input, array);
		lettering(array);

	}

	private static void lettering(int[] array) {
		int highest = 0;

		for (int i = 0; i < array.length; i++) { 
			if (highest < array[i]) {
				highest = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + ". score of Student: " + array[i] + " score:");
			
			if (array[i] < (highest - 40)) {
				System.out.println(" F");
			} else if (array[i] < (highest - 30)) {
				System.out.println(" D");
			} else if (array[i] < (highest - 20)) {
				System.out.println(" C");
			} else if (array[i] < (highest - 10)) {
				System.out.println(" B");
			} else {
				System.out.println(" A");
			}
		}
	}

	public static void displayUser(Scanner input, int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + ". score of student:");
			array[i] = input.nextInt();
		}
	}

}
