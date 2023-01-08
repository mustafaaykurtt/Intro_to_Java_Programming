package chapter_06.exercise_10;

import java.util.Scanner;

public class PrimeNumbersMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of prime numbers to display:");
		int displayNumber = input.nextInt();
		
		displayPrimeNumber(displayNumber);
	}

	public static void displayPrimeNumber(int displayNumber) {
		int number = 2;
		int countPrimeNumber = 0;
		while(countPrimeNumber < displayNumber) {
			boolean isPrime = true;
			
			for(int i = 2; i < number; i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true) {
				countPrimeNumber++;
				System.out.println(countPrimeNumber + ". Prime number: " + number);
			}
			number++;
			
		}
	}
}
