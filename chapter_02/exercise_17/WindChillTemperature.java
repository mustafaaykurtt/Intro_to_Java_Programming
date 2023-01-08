package chapter_02.exercise_17;

import java.util.Scanner;

public class WindChillTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a temperature value between -58 ºF and 41ºF :");
		double outSideTemperature = input.nextDouble();
		
		System.out.println("Enter the wind speed value with a minimum of 2 miles per hour :");
		double windSpeed = input.nextDouble();
		
		double feltTemperature = 35.74 + 0.6215 * outSideTemperature - 35.75 * Math.pow(windSpeed, 0.16)
		+ 0.4275 * outSideTemperature * Math.pow(windSpeed, 0.16);
		System.out.println("Felt temperature: " + feltTemperature);
		
	}
}
