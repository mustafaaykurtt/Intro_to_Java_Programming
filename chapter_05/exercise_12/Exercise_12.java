package chapter_05.exercise_12;

public class Exercise_12 {
	public static void main(String[] args) {
		//Question:Find the smallest n such that n2 > 12,000
		
		int n = 0;
		
		while(Math.pow(n, 2) < 10) {
			 n++;
		}
		System.out.println(n);
	}
}
