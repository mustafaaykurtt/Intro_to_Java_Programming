package chapter_04.exercise_04;

import java.util.Scanner;

public class AreaOfTheHexagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the hexagon side length : ");
		double side = input.nextDouble();
		
		double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
		System.out.println("Area = " + area); 
	}
}
