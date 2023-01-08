package chapter_03.exercise_21;

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen yili giriniz: ");
		int year =  input.nextInt();
		
		System.out.println("Lutfen ayi giriniz: ");
		int month = input.nextInt();
		
		System.out.println("Ayin kaci oldugunu giriniz: ");  
		int dayOfMonth = input.nextInt();
		
		
		int day;		
		
		
		if (month == 1 || month == 2)
		 {
		 month = (month == 1) ? 13 : 14;
		 year--;
		 }
		
		day = ( dayOfMonth + (26 * (month + 1)) / 10 + (year % 100  ) + (year % 100  ) / 4 
				+ (year / 100  ) / 4 + 5 * (year / 100  )) % 7;
		
		//System.out.println(hGun);
		
		switch (day) {
		case 0: System.out.println("cumartesi"); break;
		case 1: System.out.println("pazar"); break;
		case 2: System.out.println("pazartesi"); break;
		case 3: System.out.println("sali"); break;
		case 4: System.out.println("carsamba"); break;
		case 5: System.out.println("persembe"); break;
		case 6: System.out.println("cuma"); break;
		}
		
	}
}
