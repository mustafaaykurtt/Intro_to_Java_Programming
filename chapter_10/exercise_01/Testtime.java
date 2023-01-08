package chapter_10.exercise_01;

import java.util.Scanner;

public class Testtime {
	public static void main(String[] args) {
		Time time = new Time();
		System.out.println("Current Time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSeconds());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a timemillis value: ");
		long value = input.nextLong();
		
		Time time1 = new Time(value);
		System.out.println("Entry value:" + value + " Time:" + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSeconds());
	}
}
