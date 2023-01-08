package chapter_11.exercise_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int size = input.nextInt();

		int[][] array = new int[size][size];

		filled(array);
		print(array);

		System.out.println();

		System.out.println("Row: " + largestRow(array));
		System.out.println("Column: " + largestColumn(array));

	}

	private static void filled(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	private static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static ArrayList<Integer> largestRow(int[][] array) {
		ArrayList<Integer> index = new ArrayList<>();
		int[] count = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j][i] == 1) {
					count[j]++;
				}
			}
		}

		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	public static ArrayList<Integer> largestColumn(int[][] array) {
		ArrayList<Integer> index = new ArrayList<>();
		int[] count = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == 1) {
					count[j]++;
				}
			}
		}

		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	private static int max(int[] count) {
		int max = count[0];
		for (int i = 1; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
			}
		}
		return max;
	}

	private static void getIndex(ArrayList<Integer> index, int[] count, int max) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				index.add(i);
			}
		}
	}
}
