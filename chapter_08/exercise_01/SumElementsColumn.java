package chapter_08.exercise_01;

import java.util.Scanner;

public class SumElementsColumn {
	public static void main(String[] args) {

		double[][] dizi = new double[3][4];

		entryArray(dizi);
		sumColumn(dizi);
	}

	private static void sumColumn(double[][] array) {
		
		for (int j = 0; j < array[0].length; j++) {
			double sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i][j];
			}
			System.out.println((j + 1) + " Sum value of column = " + sum);
		}
	}

	private static void entryArray(double[][] array) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the array elements: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

	}
}
