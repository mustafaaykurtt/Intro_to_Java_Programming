package chapter_04.exercise_17;

import java.util.Scanner;

public class DaysOfMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen ay giriniz:");
		String month = input.next();
		System.out.println("lutfen yil giriniz:");
		int year = input.nextInt();

		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		System.out.print("Girdiginiz " + month + " ayi");
		if (month.startsWith("Oca") || month.startsWith("May") || month.startsWith("Mar") || month.startsWith("Tem")
				|| month.startsWith("Agu") || month.startsWith("Eki") || month.startsWith("Ara")) {
			System.out.print(" 31 gundur.");
		
		} else if(month.startsWith("Nis") || month.startsWith("Haz") || month.startsWith("Eyl")
				|| month.startsWith("Kas")) {
			System.out.print(" 30 gundur.");
			
		} else if(leapYear && month.startsWith("Sub")) {
			System.out.print(" 29 gundur.");
			
		} else if(!leapYear && month.startsWith("Sub")) {
			System.out.print(" 28 gundur.");
			
		} else {
			System.err.println("yanlis giris tekrar deneyiniz.");
		}

	}
}
