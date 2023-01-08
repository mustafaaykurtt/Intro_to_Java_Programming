package chapter_07.exercise_10;

import java.util.Scanner;

public class IndexOfSmallestElement {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		int indexOfSmallestNumber = indexOfSmallestNumber(numbers);
		System.out.println("Index of smallest element: " + indexOfSmallestNumber);
		
	}

	private static int indexOfSmallestNumber(int[] numbers) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers:");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		return smallestIndex(numbers);
	}

	private static int smallestIndex(int[] array) {
		int index = 0;
		for (int i = 0; i + 1 < array.length; i++) {
			
			if(array[i] > array[i+1]) {
				index = i + 1;
			}
		}
		return index;
	}
}
