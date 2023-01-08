package chapter_05.exercise_43;

public class MathCombinators {
	public static void main(String[] args) {
		int count = 0;
		for(int number1 = 1; number1 < 7 ; number1++) {
			
			for (int number2 = 1; number2 < number1 + 1; number2++){
				
				System.out.println(number1 + " " + number2);
				count++;
			}
		}
		System.out.println("Number of all combinations = " + count);
		
	}
}
