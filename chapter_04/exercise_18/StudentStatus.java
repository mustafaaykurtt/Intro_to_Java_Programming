package chapter_04.exercise_18;

import java.util.Scanner;

public class StudentStatus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters: ");
		String str = input.next();
		char m = 'M';
		char c = 'C';
		char i = 'I';
		char ch1 = '1';
		char ch2 = '2';
		char ch3 = '3';
		char ch4 = '4';
		
		char indexOfZero = str.charAt(0);
		char indexOfOne = str.charAt(1);

		if (indexOfZero == m && (indexOfOne == ch1 || indexOfOne == ch2 || indexOfOne == ch3 || indexOfOne == ch4)) {
			System.out.println("Math " + indexOfOne + ".class");
		}else if(indexOfZero == c && (indexOfOne == ch1 || indexOfOne == ch2 || indexOfOne == ch3 || indexOfOne == ch4)) { 
			System.out.println("Computer Sciens " + indexOfOne + ".class");
		}else if(indexOfZero == i && (indexOfOne == ch1 || indexOfOne == ch2 || indexOfOne == ch3 || indexOfOne == ch4)) {
			System.out.println("Information technologies " + indexOfOne + ".class");
		}else {
			System.err.println("Wrong entry !");
		}
	}

}
