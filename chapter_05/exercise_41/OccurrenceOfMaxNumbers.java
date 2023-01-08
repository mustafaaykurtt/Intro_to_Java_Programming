package chapter_05.exercise_41;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		int max = 0;
		int count = 0;
		
		while(number > 0) {
			System.out.println("Enter number:");
			number = input.nextInt();
			
			if (number > max) {
				count = 0;
				max = number;
				count++;
			} else if (number == max) {
				count++;
			}
			
			
		}
		System.out.println("max number :" + max + " The number of repetitions: " + count);
	}
}
