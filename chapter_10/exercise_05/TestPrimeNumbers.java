package chapter_10.exercise_05;

import java.util.Scanner;

public class TestPrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value:");
		int value = input.nextInt();
		
		PrimeNumbers factor = new PrimeNumbers();
		System.out.println("PrimeDivides: " + factor.primeFactor(value));
	}
}
