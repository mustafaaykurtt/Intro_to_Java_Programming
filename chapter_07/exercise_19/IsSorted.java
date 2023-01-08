package chapter_07.exercise_19;

import java.util.Scanner;

public class IsSorted {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of array:");
		int value = input.nextInt();
		
		int[] array = new int[value];
		array[0] = value;								//you were asked to do this in the question	
		
		for (int i = 1; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		if(isSorted (array)) {
			System.out.println("Sorted");
		} else {
			System.out.println("Not sorted!");
		}
	}

	private static boolean isSorted(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if(array[i] < array[i + 1]) {
				return true;
			} 
		}
		return false;
	}
}
