package chapter_03.exercise_15;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		int lottery = (int) (Math.random() * 900 + 100);
		System.out.println(lottery);

		int hundreds = lottery / 100;
		int rest = lottery % 100;
		int tenth = rest / 10;
		rest %= 10;
		int units = rest;

		Scanner input = new Scanner(System.in);
		System.out.println("Make a 3-digit guess.");
		int guess = input.nextInt();

		int guessHundreds = guess / 100;
		int guessRest = guess % 100;
		int guessTenth = guessRest / 10;
		guessRest %= 10;
		int guessUnits = guessRest;

		if (lottery == guess) {
			System.out.println("You win 10.000$ ");
		} else if ((hundreds == guessHundreds && units == guessTenth && tenth == guessHundreds)
				|| (hundreds == guessTenth && tenth == guessHundreds && units == guessUnits)
				|| (tenth == guessHundreds && units == guessTenth && hundreds == guessUnits)
				|| (units == guessHundreds && tenth == guessTenth && hundreds == guessUnits)
				|| (units == guessHundreds && hundreds == guessTenth && units == guessUnits)) {
			System.out.println("You win 3000$ ");
		} else if (hundreds == guessHundreds || hundreds == guessTenth || hundreds == guessUnits || tenth == guessHundreds
				|| tenth == guessTenth || tenth == guessUnits || units == guessHundreds || units == guessTenth
				|| units == guessUnits) {
			System.out.println("You win 1000$");
		} else {
			System.out.println("Try again");
		}

	}

}
