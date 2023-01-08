package chapter_03.exercise_11;

import java.util.Scanner;

public class FindNumberOfDaysMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen ay giriniz:");
		int month = input.nextInt();
		System.out.println("lutfen yil giriniz:");
		int year = input.nextInt();

		switch (month) {
		case 1: { System.out.println("Ocak " + year + " yili 31 gündür"); break;}
		case 2: { 
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Subat " + year + " yili 29 gündür");
			}else {
				System.out.println("Subat " + year + " yili 28 gündür");
			}
		break;}
		case 3:{System.out.println("Mart " + year + " yili 31 gündür");break;}
		case 4:{System.out.println("Nisan " + year + " yili 30 gündür");break;}
		case 5:{System.out.println("Mayis " + year + " yili 31 gündür");break;}
		case 6:{System.out.println("Haziran " + year + " yili 30 gündür");break;}
		case 7:{System.out.println("Temmuz " + year + " yili 31 gündür");break;}
		case 8:{System.out.println("Agustos " + year + " yili 31 gündür");break;}
		case 9:{System.out.println("Eylul " + year + " yili 30 gündür");break;}
		case 10:{System.out.println("Ekim " + year + " yili 31 gündür");break;}
		case 11:{System.out.println("Kasim " + year + " yili 30 gündür");break;}
		case 12:{System.out.println("Aralik " + year + " yili 31 gündür");break;}
		}
	}

}
