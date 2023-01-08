package chapter_02.exercise_01;

import java.util.Scanner;

public class CelcToFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a celcius value: ");
		
		int celcius = input.nextInt();
		double fahrenheit =(9 / 5.0) * celcius + 32;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		
	}
}
