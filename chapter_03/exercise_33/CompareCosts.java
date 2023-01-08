package chapter_03.exercise_33;

import java.util.Scanner;

public class CompareCosts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1:");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.println("Enter weight and price for package 2:");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();

		double cost1 = price1 / weight1;
		double cost2 = price2 / weight2;

		if (cost1 > cost2) {
			System.out.println("Choose the package1");
		} else if (cost1 == cost2) {
			System.out.println("Two package are the same price");
		} else {
			System.out.println("Choose the package2");
		}

	}
}
