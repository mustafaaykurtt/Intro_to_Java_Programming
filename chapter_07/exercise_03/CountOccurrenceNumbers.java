package chapter_07.exercise_03;

import java.util.Scanner;

public class CountOccurrenceNumbers {
	public static void main(String[] args) {
		int[] array = new int[100];
		System.out.println("Enter a number from 1 to 100: ");
		
		count(array);
		printArray(array);
	}

	private static void count(int[] array) {
		Scanner input = new Scanner(System.in);
		int number = 1;
		
		while(number != 0) {
			 number = input.nextInt();
			if(number >= 1 && number <= 100) {
				array[number - 1]++;
			}
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				System.out.println((i + 1) + " occurs " + array[i] + (array[i] > 1 ? " times" : " time"));
			}
		}
	}
}
