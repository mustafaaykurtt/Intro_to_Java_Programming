package chapter_03.exercise_30;

import java.util.Scanner;

public class CurrentTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter GMT zone :");
		int gmt = input.nextInt();

		long totalMiliSeconds = System.currentTimeMillis();

		long totalSeconds = totalMiliSeconds / 1000;
		long currendSeconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHours = (totalHours % 24) + gmt;


		System.out.println("Time : " 
		+ ((currentHours > 12 ? currentHours - 12 : currentHours) + ":" + currentMinutes + ":" + currendSeconds + (currentHours > 12 ? " PM" : "AM" )))  ;

	}
}
