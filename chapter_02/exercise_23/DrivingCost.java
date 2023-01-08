package chapter_02.exercise_23;

import java.util.Scanner;

public class DrivingCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance: ");
		System.out.println("Enter the vehicle fuel consumption: ");
		System.out.println("Enter the fuel price : ");
		
		double distance = input.nextDouble();
		double fuelConsumption = input.nextDouble();
		double fuelPrice = input.nextDouble();
		double fuelCost = distance * fuelPrice / fuelConsumption;
		
		System.out.println("Total driving cost : " + fuelCost);
	}
}
