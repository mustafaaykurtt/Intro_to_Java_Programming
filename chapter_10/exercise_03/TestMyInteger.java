package chapter_10.exercise_03;


public class TestMyInteger {
	public static void main(String[] args) {
		int[] values = {5, 6, 7, 8, 9};
		
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(values[i] + " is Even? " + value.isEven());
		}
		System.out.println();
		for (int i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(values[i] + " is Odd? " + value.isOdd());
		}
		System.out.println();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i] + " is Prime? " + MyInteger.isPrime(values[i]));
		}
		
		int a = MyInteger.parseInt("123");
		System.out.println(a * 2);
		
		MyInteger value = new MyInteger(5);
		System.out.println(value.equals(5));
	}
}
