package chapter_12.exercise_10;

public class Exercise_10 {
	public static void main(String[] args) {
		try {
			int[] temp = new int[1000000000];
            temp = new int[temp.length * 1000000000];
		}
		catch (OutOfMemoryError ex) { 
			System.out.println(ex.getMessage());
		}
		System.out.println("Error handled program continues... ");
	}
}
