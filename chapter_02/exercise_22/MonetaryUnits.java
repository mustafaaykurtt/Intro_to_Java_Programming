package chapter_02.exercise_22;

import java.util.Scanner;

public class MonetaryUnits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of money: ");
		
		double money = input.nextDouble();
		
		int tl = (int)money / 100;
		int kurus = (int) money % 100; 
		System.out.println(tl + " tl " + kurus + " kurustur.");
	}
}
