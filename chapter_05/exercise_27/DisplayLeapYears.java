package chapter_05.exercise_27;

public class DisplayLeapYears {
	public static void main(String[] args) {
		int countLeapYear = 0;
		int leapYear = 0;

		for (int year = 101; year < 2101; year++) {
			boolean isLeapYear = false;

			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				isLeapYear = true;
				leapYear = year;
				countLeapYear++;
			}

			if (isLeapYear) {
				if (countLeapYear % 10 == 0) {
					System.out.println(leapYear + " ");
				} else {
					System.out.print(leapYear + " ");
				}
			}
		}
	}
}
