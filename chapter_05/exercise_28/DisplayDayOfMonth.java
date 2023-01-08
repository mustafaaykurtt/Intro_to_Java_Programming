package chapter_05.exercise_28;

import java.util.Scanner;

public class DisplayDayOfMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Yıl giriniz:");
		int year = input.nextInt();
		System.out.println("Gun giriniz ( 0- pazar , 6 - Cumartesi");
		int day = input.nextInt();
		
		
		
		for (int month = 1; month < 13; month++) {
			String output = "1 ";
			
			switch (month) {
			case 1: output += "Ocak";break;
			case 2: output += "Subat";break;
			case 3: output += "Mart";break;
			case 4: output += "Nisan";break;
			case 5: output += "Mayis";break;
			case 6: output += "Haziran";break;
			case 7: output += "Temmuz";break;
			case 8: output += "Agustos";break;
			case 9: output += "Eylül";break;
			case 10: output += "Ekim";break;
			case 11: output += "Kasim";break;
			case 12: output += "Aralik";break;
			}
			
			output += ", " + year + " ";
			
			day %= 7 ;
			
			switch (day) {
			case 0: output += "Pazar";break;
			case 1: output += "Pazartesi";break;
			case 2: output += "Sali";break;
			case 3: output += "Carsamba";break;
			case 4: output += "Persembe";break;
			case 5: output += "Cuma";break;
			case 6: output += "Cumartesi";break;
			}
			
			System.out.println(output);

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				day += 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				day += 30;
			} else if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) { 
				day += 29;
			} else if (month == 2){
				day += 28;
			}
		}
	}
}
