package chapter_06.exercise_05;

public class SortThreeNumbers {
	public static void main(String[] args) {
		int a = compare(compare(6, 5) , 1);
		System.out.println(a);
	}

	private static int compare(int number1 , int number2) {
		
		if (number1 <= number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		} else {
			
		}
		return number1;
	}
}
