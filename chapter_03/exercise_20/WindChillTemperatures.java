package chapter_03.exercise_20;

import java.util.Scanner;

public class WindChillTemperatures {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a temperature value between -58 ºF and 41ºF:");
		double outSideTemperature = input.nextDouble();

		if (outSideTemperature > 41 || outSideTemperature < -58) {
			System.out.println("Temperature value is wrong");
		} else {
			System.out.println("Enter value of wind speed:");
			double windSpeed = input.nextDouble();

			if (windSpeed >= 2) {
				double feltTemperature = 35.74 + 0.6215 * outSideTemperature - 35.75 * Math.pow(windSpeed, 0.16)
						+ 0.4275 * outSideTemperature * Math.pow(windSpeed, 0.16);
				System.out.println("Felt temperature: " + feltTemperature);

			} else {
				System.out.println("Wind speed is wrong");
			}
		}

	}
}
