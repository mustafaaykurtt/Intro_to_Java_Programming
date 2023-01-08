package chapter_05.exercise_01;

import java.util.Scanner;

public class CountPositiveNegatifAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number (the program will terminate when you enter 0):");
		int number = -1;
		int countNegative = 0;
		int countPositive = 0;
		double sum = 0;
		double average = 0;
		
		while (number != 0) {
			number = input.nextInt();
			
			if (number < 0) {
				countNegative++;
			} else if (number > 0){
				countPositive++;
			}else;
				
			sum += number;
			average = sum / (countNegative + countPositive);
		}
		
		System.out.println("Number of positive integers entered =" + countPositive);
		System.out.println("Number of negative integers entered=" + countNegative);
		System.out.println("Sum numbers = " + sum);
		System.out.println("Average of numbers =" + average);
		
	}
}
