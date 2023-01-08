package chapter_04.exercise_21;

import java.util.Scanner;

public class CheckSSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter insurance number:");
		String str = input.next();
		
		String a = str.substring(3 , 4);
		String b = str.substring(6 , 7);
		int length = str.length();
		
		if (a.equals("-") && b.equals("-") && length == 11) {
			System.out.println(str + " is a valid social security number.");
		}else {
			System.out.println(str + " isn't a valid social security number.");
		}
		
		
	}
}
