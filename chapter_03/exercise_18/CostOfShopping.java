package chapter_03.exercise_18;

import java.util.Scanner;

public class CostOfShopping {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Lutfen agirligi giriniz: ");
		int weight = input.nextInt();
		double price = 0;

		if (weight < 0) {
			System.out.println("Lutfen yeni sayi giriniz.");
		} else if (weight > 50) {
			System.out.println("Bu paket kargolanamaz.");
		} else if (weight <= 1) {
			price = 3.5;
			System.out.println("Fiyat = " + price * weight);
		} else if (weight <= 3) {
			price = 5.5;
			System.out.println("Fiyat = " + price * weight);
		} else if (weight <= 10) {
			price = 8.5;
			System.out.println("Fiyat = " + price * weight);
		} else if (weight <= 20) {
			price = 10.5;
			System.out.println("Fiyat = " + price * weight);
		}	
		
	}

}
