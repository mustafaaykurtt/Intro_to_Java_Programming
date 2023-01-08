package chapter_02.exercise_11;

import java.util.Scanner;

public class PopulationProjection {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double population = 312032486;
		System.out.println("Enter the year: ");
		
		int year = input.nextInt();
		int totalSeconds = year * 365 * 24 * 60 * 60;
		
		int birth = totalSeconds / 7;
		int deads = totalSeconds / 13;
		int in = totalSeconds / 45;
		
		int toplamNufus = (int) (population + birth + in - deads);
		System.out.println("Total population : " + toplamNufus);
		
	}
}
