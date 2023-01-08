package chapter_05.exercise_20;

public class DisplayPrimeNumbers {
	public static void main(String[] args) {
		int number = 2;

		while (number < 1001) {
			boolean isPrime = true;

			for (int i = 2; i < number / 2 + 1; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime == true) {
				System.out.printf("%4d", number);
			}

			number++;
		}

	}
}
