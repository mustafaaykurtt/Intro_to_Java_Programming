package chapter_05.exercise_13;

public class Exercise_13 {
	public static void main(String[] args) {
		
		// Question: Find the largest n such that n3 < 12,000
		int n = 0;
		
		while(Math.pow(n, 3) < 12000) {
			 n++;
		}
		System.out.println(n - 1);
		
	}
}
