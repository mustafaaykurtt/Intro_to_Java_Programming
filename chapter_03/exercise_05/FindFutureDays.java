package chapter_03.exercise_05;

import java.util.Scanner;

public class FindFutureDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kacinci gundesiniz yazınız: ");
		int currentNumberOfDay = input.nextInt();
		System.out.println("Bugunden kac gun sonrasının bulunacagini yaziniz: ");
		int afterDay = input.nextInt();
		
		int newDay = (currentNumberOfDay + afterDay) % 7;
		
		System.out.print("Bugun günlerden: ");
		
		switch(currentNumberOfDay) {
		case 0:System.out.print("Pazar");break;
		case 1:System.out.print("Pazartesi");break;
		case 2:System.out.print("Sali");break;
		case 3:System.out.print("Carsamba");break;
		case 4:System.out.print("Persembe");break;
		case 5:System.out.print("Cuma");break;
		case 6:System.out.print("Cumartesi");break;
			default: System.out.print("yanlis giris!");
		}
		
		System.out.print(" ve gelecekteki gun: ");
		
		switch(newDay) {
		case 0:System.out.print("Pazar");break;
		case 1:System.out.print("Pazartesi");break;
		case 2:System.out.print("Sali");break;
		case 3:System.out.print("Carsamba");break;
		case 4:System.out.print("Persembe");break;
		case 5:System.out.print("Cuma");break;
		case 6:System.out.print("Cumartesi");break;
			default: System.out.println("yanlis giris!");
		}
		
	
	}
	
}
