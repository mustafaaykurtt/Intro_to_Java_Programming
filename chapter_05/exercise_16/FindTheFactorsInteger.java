package chapter_05.exercise_16;

import java.util.Scanner;

public class FindTheFactorsInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = input.nextInt();
		String factors = "";

		int sayac = 2;
		while (sayac < number + 1 ) {
			
			int i = 0;
			while (number % sayac == 0 && i < number ) {
				number = number / sayac;
				factors += sayac + ",";
				i++;
			}
			
			sayac++;
		}
		System.out.println(factors);
	}
}
