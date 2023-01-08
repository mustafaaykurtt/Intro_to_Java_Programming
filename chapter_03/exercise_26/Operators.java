package chapter_03.exercise_26;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int value = input.nextInt();
		
		
		System.out.println(value + " is divide 5 and 6 ?" + ((value % 5 == 0 && value % 6 == 0) ? "True" : "False"));
		System.out.println(value + " is divide 5 or 6 ?" + ((value % 5 == 0 || value % 6 == 0) ? "True" : "False"));
		System.out.println(value + " Can be completely divisible by 5 or 6, but not both ?" 
		+ ((value % 5 == 0 ^ value % 6 == 0) ? "True" : "False"));
		
		
	}
}
