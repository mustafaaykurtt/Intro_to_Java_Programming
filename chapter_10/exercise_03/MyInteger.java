package chapter_10.exercise_03;

public class MyInteger {
	private int value;

	public MyInteger() {

	}

	public MyInteger(int value) {
		this.value = value;
	}

	public boolean isEven() {
		return isEven(value);
	}

	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
		
	public boolean equals(MyInteger myInteger) {
		return myInteger.value == this.value;
	}

	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) {
		return value % 2 == 0;
	}
	
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0 , j = (int) Math.pow(10, (str.length() - 1)); i < str.length(); i++ , j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
	}

	public int getValue() {
		return value;
	}
}
