package chapter_07.exercise_07;

public class CountSingleDigits {
	public static void main(String[] args) {
		int number = 10;
		int[] array = new int[number];
		int[] again = new int[array.length];
		
		randomAssignment(array);
		printArray(array);
		findRepeat(array, again);
		printRepeatArray(again);
		
	}

	public static void findRepeat(int[] array, int[] again) {
		for (int i = 0; i < again.length; i++) {
			
			again[array[i] ]++;
		}
	}

	private static void printRepeatArray(int[] again) {
		for (int i = 0; i < again.length; i++) {
			if(again[i] > 0) {
				System.out.println(i + ": " + again[i]);
			}
		}
		
	}

	public static void randomAssignment(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 5);
		}
	}
	
	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%-2d" , array[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
