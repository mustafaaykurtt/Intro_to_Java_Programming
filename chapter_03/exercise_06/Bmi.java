package chapter_03.exercise_06;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		final double POUND = 0.45359237;
		final double INC = 0.0254;
		final double FEET_TO_METRE = 0.3048;
		
		System.out.print("Lutfen agırlıgı (pound) giriniz: ");
		double kg = input.nextDouble() * POUND ;
		
		System.out.print("Feet giriniz: ");
		double metreFeet = input.nextDouble() * FEET_TO_METRE ;
		
		System.out.print("inc giriniz: ");
		double metreInc = input.nextDouble() * INC ;
		
		double totalMeters = metreFeet + metreInc;
		double bmi = kg / Math.pow(totalMeters, 2);
		
		System.out.println("Vucut kitle indeksiniz: " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("Zayif");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Hafif Kilolu");
		} else {
			System.out.println("Obezsin");
		}
	}
}
