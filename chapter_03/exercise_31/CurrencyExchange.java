package chapter_03.exercise_31;

import java.util.Scanner;

public class CurrencyExchange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dolardan Tr ' ye doviz kurunu giriniz:");
		double dolarTl = input.nextDouble();

		System.out.println("Dolari TL’ye cevirmek icin 0; tersini yapmak icin 1 giriniz: ");
		int exchange = input.nextInt();

		switch (exchange) {
		case 0:
			System.out.println("Dolar miktarini giriniz:");
			double amount = input.nextDouble();
			double calculate = amount * dolarTl;
			System.out.println("$" + amount + " , " + calculate + "Tl'dir.");
			break;
		case 1:
			System.out.println("Tl miktarini giriniz:");
			amount = input.nextDouble();
			calculate = (1 / dolarTl) * amount;
			System.out.println( amount + "Tl , " + calculate  + "dolar'dir.");
			break;
		default:
			System.out.println("yanlis giris.");
		}
	}
}
