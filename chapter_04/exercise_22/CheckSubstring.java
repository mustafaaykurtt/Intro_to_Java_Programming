package chapter_04.exercise_22;

import java.util.Scanner;

public class CheckSubstring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the once word");
		String str1 = input.next();
		System.out.println("Enter the twice word.");
		String str2 = input.next();
		
		boolean a = str1.contains(str2);
		if(a) {
			System.out.println(str2 + " " + str1 + "'s is in" );
		}else {
			System.out.println(str2 + " " + str1 + "'s is not in");
		}
	}
}
