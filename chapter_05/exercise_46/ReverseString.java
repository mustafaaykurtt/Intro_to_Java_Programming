package chapter_05.exercise_46;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String str = input.nextLine();
		String reverse = "";
		int length = str.length() -1;
		
		
		int i = length;
		while(i > -1) {
			
			char ch = str.charAt(i);
			reverse += ch;
			
			
			i--;
		}
		System.out.print(reverse);
	}
}
