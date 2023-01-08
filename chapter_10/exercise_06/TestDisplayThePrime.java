package chapter_10.exercise_06;

import java.util.Scanner;

public class TestDisplayThePrime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter prime number to display: ");
		int primeDisplay = input.nextInt();
		
		DisplayThePrime displayThePrime = new DisplayThePrime(primeDisplay);
		
		for (int i = primeDisplay -1; i > -1; i--) {
		System.out.print(displayThePrime.prime(primeDisplay).elements[i] + ", ");
		}
	}
}
