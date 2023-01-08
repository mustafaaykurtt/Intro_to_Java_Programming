package chapter_04.exercise_20;

import java.util.Scanner;

public class ProcessString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		int a = str.length();
		String b = str.substring(0 , 1);
		System.out.println(a);
		System.out.println(b);
	}
}
