package chapter_08.exercise_13;

import java.util.Scanner;

public class LocateLargestElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows:");
		int row = input.nextInt();
		
		System.out.print("Enter the number of columns:");
		int column = input.nextInt();
		
		double[][] array = new double[row][column];
		int[] index = new int[2];
		
		entryArray(array);
		largestElementsIndex(array , index);
		printIndex(index);
		
	}

	public static void entryArray(double[][] array) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
	}

	private static int[] largestElementsIndex(double[][] array , int[] index) {
		double largest = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(largest < array[i][j]) {
					largest = array[i][j];
					index[0] = i;
					index[1] = j;
				}
			}
		}
		
		return index;
	}
	
	private static void printIndex(int[] index) {
		for (int i : index) {
			System.out.print(i + " ");
		}
	}
}
