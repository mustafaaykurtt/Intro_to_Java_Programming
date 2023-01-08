package chapter_08.exercise_10;

import java.util.Scanner;

public class LargestRowColumn {
	public static void main(String[] args) {

		int[][] dizi = new int[4][4]; 

		entryArray(dizi);
		int higgestRow = controlRow(dizi);
		int higgestColumn = controlColumn(dizi);
		
		System.out.println("Larget row index: " + higgestRow + "\n" + "Largest column index: " + higgestColumn);

	}

	public static void entryArray(int[][] array) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter elements of matrice: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}
			
	}

	private static int controlColumn(int[][] array) {
		int largestIndex = 0;
		int largestNumber = 0;
		for (int j = 0; j < array[0].length; j++) {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i][j]== 1) {
					count++;
				}
				
				if (count > largestNumber) {
					largestNumber = count;
					largestIndex = i;
				}
			}
			
		}
		return largestIndex;
	}

	public static int controlRow(int[][] array) {
		int largestIndex = 0;
		int largestNumber = 0;
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i][j]== 1) {
					count++;
				}
				
				if (count > largestNumber) {
					largestNumber = count;
					largestIndex = i;
				}
			}
		}
		return largestIndex;
	}
}
