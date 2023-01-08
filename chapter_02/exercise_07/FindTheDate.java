package chapter_02.exercise_07;

import java.util.Scanner;

public class FindTheDate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the minute to be calculated: ");
		
		int sumMinute = input.nextInt();
		int year = sumMinute / (365 * 60 * 24);
		int day = (sumMinute / (24 * 60)) % 365;
		int hour = (sumMinute / 60) % 24;
		int minute = sumMinute % 60; 

		System.out.println(sumMinute + " minutes " + year + " year " + day + " day " + hour + " hour " 
		+ minute + " is minute." );
	}

}
