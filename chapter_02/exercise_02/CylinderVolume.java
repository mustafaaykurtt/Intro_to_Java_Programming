package chapter_02.exercise_02;

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius and height: ");
		final float PI = 3.14159F;
		float radius = input.nextFloat();
		float height = input.nextFloat();
		
		double area = Math.pow(radius, 2) * PI;
		double volume = area * height;
		
		System.out.println("Alani: " +(int) (area * 10000) / 10000.0);
		System.out.println("Volume: " + (int) (volume * 10000) / 10000.0);
		
		
	}
}
