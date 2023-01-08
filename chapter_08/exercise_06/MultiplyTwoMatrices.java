package chapter_08.exercise_06;

import chapter_08.exercise_02.SumMajorDiagonal;

public class MultiplyTwoMatrices {
	public static void main(String[] args) {
		double[][] array1 = new double[3][3];
		double[][] array2 = new double[3][3];
		double[][] array3 = new double[3][3];
		
		SumMajorDiagonal.entryArray(array1);
		SumMajorDiagonal.entryArray(array2);
		
		multiplyMatrices(array1 , array2 , array3);
	
	}

	public static void multiplyMatrices(double[][] array1, double[][] array2 , double[][] array3) {
		for (int i = 0; i < array2.length; i++) {
			double sum = 0;
			for (int j = 0; j < array2[i].length; j++) {
				sum += array1[i][j] * array2[j][i];
				array3[i][j] = sum;
			}
		}
		
		for (double[] is : array3) {
			for (double i : is) {
				System.out.print(i + "  ");
			}
			System.out.println();
		}
	}
}
