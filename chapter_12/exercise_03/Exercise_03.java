package chapter_12.exercise_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list = new int[100];
		filled(list);

		System.out.println("Enter array of index: ");
		while (true) {
			try {
				int index = input.nextInt();
				System.out.println("index value is: " + list[index]);
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds...");
				System.out.print("Try again: ");
			} catch (InputMismatchException e) {
				System.out.println("Illegal Argument...");
				System.out.print("Try again: ");
				input.next();
			}
		}
	}

	private static void filled(int[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 100);
		}
	}
}
