package chapter_09.exercise_05;

import java.util.*;

public class Calendar {
	public static void main(String[] args) {
		GregorianCalendar calender = new GregorianCalendar();
		System.out.println("Current year, month, and day in format Month/Day/Year");
		System.out.println(calender.get(GregorianCalendar.MONTH) + "/" + calender.get(GregorianCalendar.DAY_OF_MONTH)
				+ "/" + calender.get(GregorianCalendar.YEAR) + "\n");

		calender.setTimeInMillis(1234567898765L);

		System.out.println("Current new year, month, and day in format Month/Day/Year");
		System.out.println(calender.get(GregorianCalendar.MONTH) + "/" + calender.get(GregorianCalendar.DAY_OF_MONTH)
				+ "/" + calender.get(GregorianCalendar.YEAR));
	}
}
