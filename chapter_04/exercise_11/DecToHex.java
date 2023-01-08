package chapter_04.exercise_11;

import java.util.Scanner;

public class DecToHex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		if (0 <= number && number <= 9) {
			System.out.println(number);
		}else if(10 <= number && number <= 15) {
			char a = (char) (number + 'A' - 10);
			System.out.println(a);
		}
		
		
	}
}
