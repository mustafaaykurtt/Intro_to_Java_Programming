package chapter_02.exercise_10;

import java.util.Scanner;

public class CalculatingEnergy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int FIXED = 4184; 
		System.out.println("Enter the weight of the water in kg :");
		double weightOfWater = input.nextDouble();
		System.out.println("Enter initial heat:");
		double initialHeat = input.nextDouble();
		System.out.println("Enter final heat:");
		double finalHeat = input.nextDouble();
		
		double energy = weightOfWater * (finalHeat - initialHeat) * FIXED;
		System.out.println("Required energy : " + energy) ;
	}
}
