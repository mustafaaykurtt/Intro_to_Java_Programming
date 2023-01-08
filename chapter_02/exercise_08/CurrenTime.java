package chapter_02.exercise_08;

import java.util.Scanner;

public class CurrenTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println( "Enter the time zone as GMT:");
		int gmt = input.nextInt();
		
		long totalMiliSeconds = System.currentTimeMillis();
		
		long totalSeconds = totalMiliSeconds / 1000;
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHours = (totalHours % 24) + gmt;
		
		System.out.println("Time : " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
		
				
		
		
	}

}
