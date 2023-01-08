package chapter_05.exercise_02;

public class RepeatAdditions {
	public static void main(String[] args) {
		long startedTime = System.currentTimeMillis();
		
		int sum = 0;
		int number = 0;
		
		
		for(int count = 0; count < 11 ; count++) {
		 number = (int)(Math.random() * 15 + 1);
		 sum += number;
		
		}
		System.out.println("Random sum of 10 numbers = " + sum);
		long endTime = System.currentTimeMillis();
		int time = (int)(endTime - startedTime) / 1000;
		System.out.println("Test time = " + time + " seconds.");
	}
}
