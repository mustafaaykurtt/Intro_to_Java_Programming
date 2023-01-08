package chapter_10.exercise_06;


public class DisplayThePrime {
	private int value;

	public DisplayThePrime() {
		value = 120;
	}

	public DisplayThePrime(int value) {
		this.value = value;
	}

	public StackOfIntegers prime() {
		StackOfIntegers stack = new StackOfIntegers();
		display(value, stack);
		return stack;
	}

	public StackOfIntegers prime(int value) {
		StackOfIntegers stack = new StackOfIntegers(value);
		display(value, stack);
		return stack;
	}

	public static void display(int value, StackOfIntegers stack) {
		int countPrime = 0;
		int divided = 2;
		

		while (countPrime < value) {
			boolean isPrime = true;

			for (int i = 2; i < divided ; i++) {
				if (divided % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
			stack.push(divided);
				countPrime++;
			}
			divided++;
		}
	}
}
