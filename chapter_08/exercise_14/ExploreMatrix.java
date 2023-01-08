package chapter_08.exercise_14;

public class ExploreMatrix {

	public static void main(String[] args) {

		int[][] dizi = new int[4][4];

		chapter_08.exercise_10.LargestRowColumn.entryArray(dizi);
		controlRow(dizi);
		controlColumn(dizi);
		controlMajor(dizi);
		controlMinor(dizi);
	}

	private static void controlRow(int[][] array) {
		System.out.println("-----Control rows-----");
		for (int i = 0; i < array.length; i++) {
			int[] row = new int[4];
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1) {
					row[j] = 1;
				}
			}
			control(i, row);
		}
		System.out.println();
	}

	private static void controlColumn(int[][] array) {
		System.out.println("-----Control column-----");
		for (int j = 0; j < array[0].length; j++) {
			int[] column = new int[4];
			for (int i = 0; i < array.length; i++) {
				if (array[i][j] == 1) {
					column[i] = 1;
				}
			}
			control(j, column);
		}
		System.out.println();
	}

	public static void control(int i, int[] value) {
		if (checkRow(value) == 4) {
			System.out.println(i + ". place all 1");
		} else if (checkRow(value) == 0) {
			System.out.println(i + ". place all 0");
		} else {
			System.out.println(i + ". no same number in row");
		}
	}

	private static int checkRow(int[] row) {
		int isOne = 0;
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 1) {
				isOne++;
			}
		}
		return isOne;
	}

	private static void controlMajor(int[][] array) {
		System.out.println("-----Control Major-----");
		int[] major = new int[4];
		for (int i = 0; i < array.length; i++) {
			major[i] = array[i][i];
		}
		checkMajor(major);
		System.out.println();
	}

	private static void checkMajor(int[] major) {
		if (checkRow(major) == 4) {
			System.out.println("major is all 1");
		} else if (checkRow(major) == 0) {
			System.out.println("major is all 0");
		} else {
			System.out.println("no same number in major");
		}
	}

	private static void controlMinor(int[][] array) {
		System.out.println("-----Control minor-----");
		int[] minor = new int[4];
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			minor[i] = array[i][j];
		}
		checkMinor(minor);
	}

	private static void checkMinor(int[] minor) {

		if (checkRow(minor) == 4) {
			System.out.println("minor is all 1");
		} else if (checkRow(minor) == 0) {
			System.out.println("minor is all 0");
		} else {
			System.out.println("no same number in minor");
		}
	}
}
