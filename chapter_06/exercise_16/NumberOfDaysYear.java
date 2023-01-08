package chapter_06.exercise_16;

public class NumberOfDaysYear {
	public static void main(String[] args) {
		System.out.println("Number of days between 2000 - 2020");

		int year = 2000;
		int endYear = 2022;

		System.out.println("Year    Number of Day");
		System.out.println("-----------------");

		for (int i = year; i <= endYear; i++) {

			System.out.println(i + "     " + getnumberOfDay(i));
		}
	}

	private static int getnumberOfDay(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return 366;
		} else {
			return 365;
		}
	}

}
