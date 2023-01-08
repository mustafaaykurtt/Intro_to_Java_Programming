package chapter_08.exercise_02;

import java.util.Scanner;

public class SumMajorDiagonal {
	public static void main(String[] args) {

		double[][] array = new double[4][4];

		entryArray(array);
		double sumMajorDiag = sumMajorDiag(array);
		System.out.println("Major diagonal sum = " + sumMajorDiag);
	}

	public static double sumMajorDiag(double[][] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
				sum += array[i][i];
		}
		return sum;
	}

	public static void entryArray(double[][] array) {
		Scanner input = new Scanner(System.in);

		System.out.println("dizi elemanlarini giriniz: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
	}
	
	
	public static void entryArray(int[][] dizi) {
		Scanner input = new Scanner(System.in);

		System.out.println("dizi elemanlarini giriniz: ");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				dizi[i][j] = input.nextInt();
			}
		}
	}
}
