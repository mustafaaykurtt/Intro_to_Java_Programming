package chapter_08.exercise_05;

import chapter_08.exercise_02.SumMajorDiagonal;

public class AddTwoMatrices {
	public static void main(String[] args) {
		double[][] array1 = new double[3][3];
		double[][] array2 = new double[3][3];
		double[][] array3 = new double[3][3];
		
		SumMajorDiagonal.entryArray(array1);
		SumMajorDiagonal.entryArray(array2);
		
		sumMatrix(array1 , array2 , array3);
	}

	public static void sumMatrix(double[][] array1, double[][] array2 , double[][] array3) {
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		
		for (double[] is : array3) {
			for (double i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
