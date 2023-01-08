package chapter_03.exercise_07;

import java.util.Scanner;

public class MonetaryUnitsForTl {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Lütfen parayı giriniz: ");
		double para = klavye.nextDouble();

		int toplamKurus = (int) (para * 100);

		int toplamTl = toplamKurus / 100;

		int elliKurus = (toplamKurus % 100) / 50;

		int yirmiBesKurus = (toplamKurus % 50) / 25;

		int onKurus = (toplamKurus % 25) / 10;

		int birKurus = (toplamKurus % 5) / 1;
		
		if (para > 0) {
			System.out.println(toplamTl + (toplamTl == 1 ? " tl" : " tller"));
			System.out.println(elliKurus + (elliKurus == 1 ? " kurus" : " kuruslar"));
			System.out.println(yirmiBesKurus +(yirmiBesKurus == 1 ? " yirmibeskurus" : " yirmibeskuruslar" ));
			System.out.println(onKurus +(onKurus == 1 ? " onKurus" : " onKuruslar" ));
			System.out.println(birKurus +(birKurus == 1 ? " birkurus" : " birKuruslar" ));
		}else {
			System.out.println("yanlis girdiniz!..");
		}
		
	}
}
