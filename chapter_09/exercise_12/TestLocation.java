package chapter_09.exercise_12;

import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row and column: ");
		int row = input.nextInt();
		int column = input.nextInt();

		double[][] array = new double[row][column];
		diziyiGir(array);

		Location location = new Location(array);

		System.out.println("The location of the largest element is " + location.getMaxValue() + " at ("
				+ location.getRow() + "," + location.getColumn() + ")");
	}

	private static void diziyiGir(double[][] array) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter matrix:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
	}
}
