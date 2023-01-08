package chapter_07.exercise_05;

import java.util.Scanner;

public class DiscintNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] differentNumbers = new int[10];
		int number; 
		int count = 0;
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < differentNumbers.length; i++) {
			number = input.nextInt();
			
			if(isDifferent(differentNumbers ,number)) {
				differentNumbers[count] = number;
				count++;
			}
		}
		
		printArray(differentNumbers, count);
		
	}

	private static void printArray(int[] differentNumber, int count) {
		System.out.println("Number of different numbers: " + count);
		System.out.print("Different numbers: ");
		for (int i = 0; i < differentNumber.length; i++) {
			if (differentNumber[i] > 0)
				System.out.print(" " + differentNumber[i]);
		}
		System.out.println();
		
	}

	private static boolean isDifferent(int[] differentNumbers, int number) {
		for (int i = 0; i < differentNumbers.length; i++) {
			if(number == differentNumbers[i]) {
				return false;
			}
		}
		return true;
	}
}
