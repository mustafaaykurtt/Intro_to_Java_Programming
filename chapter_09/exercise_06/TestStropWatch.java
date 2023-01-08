package chapter_09.exercise_06;

import java.util.Arrays;

public class TestStropWatch {
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		
		int[] array = new int[100_000];
		randomArray(array);
		sortArray(array);
		
		stopWatch.setEndTime(System.currentTimeMillis());
		System.out.println("The passing time: " + stopWatch.getElapsedTime());
		
	}

	private static void randomArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] =(int) Math.random() * 100;
		}
	}
	
	private static void sortArray(int[] array) {
		Arrays.sort(array);
	}
}
