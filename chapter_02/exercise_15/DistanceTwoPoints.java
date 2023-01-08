package chapter_02.exercise_15;

import java.util.Scanner;

public class DistanceTwoPoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 , x2 , y1 , y2:  ");
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distance = Math.pow( (Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2) ) , 0.5 ) ;
		
		System.out.println("Distance : " + distance );
	}
}
