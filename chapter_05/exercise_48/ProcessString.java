package chapter_05.exercise_48;

import java.util.Scanner;

public class ProcessString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = input.nextLine();
		int length = str.length() ;
		
		int i = 0;
		while ( i < length ) {
			char ch = str.charAt(i);
			System.out.println(ch);
			i += 2; 
		}
	}
	
	
}
