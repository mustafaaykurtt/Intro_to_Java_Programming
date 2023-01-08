package chapter_04.exercise_14;

import java.util.Scanner;

public class ConvertLetterToNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the note as a letter:");
		String str = input.next();
		
		char ch = str.toUpperCase().charAt(0);
		
		if ('A' <= ch && ch <= 'D') {
			int d = (ch * (-1)) + 'A' + 4;
			System.out.println(ch + " letter equivalent = " + d);
		}else if (ch == 'F') {
			int d = (ch * (-1)) + 'A' + 5;
			System.out.println(ch + " letter equivalent = " + d);
		}else {
			System.out.println("Wrong entry !");
		}
	}
}
