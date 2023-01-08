package chapter_02.exercise_09;

import java.util.Scanner;

public class AverageSpeed {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter v1(m/s),v2(m/s) and t(sn) : ");
		
		float v1 = input.nextFloat();
		float v2 = input.nextFloat();
		float t = input.nextFloat();
	
		float averageSpeed = ((v2 - v1) / t);

		System.out.println("Average speed : " + (int)(averageSpeed * 10000) / 10000.0) ;
	}

}
