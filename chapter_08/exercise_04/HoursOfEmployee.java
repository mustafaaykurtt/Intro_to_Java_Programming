package chapter_08.exercise_04;

import java.util.Arrays;

import chapter_08.exercise_02.SumMajorDiagonal;

public class HoursOfEmployee {
	public static void main(String[] args) {
		
		int[][] array = new int[8][7];
		
		SumMajorDiagonal.entryArray(array);
		
		decreasing(array);
	}

	private static void decreasing(int[][] array) {
		System.out.println("           Pzr  Pzt  Sa  Car  Per  Cum  Cmt");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Eleman " + (i + 1) + " : " );
			for (int j = 0; j < array[i].length; j++) {
				Arrays.sort(array[i]);
				System.out.print(array[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
