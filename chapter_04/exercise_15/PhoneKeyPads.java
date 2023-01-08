package chapter_04.exercise_15;

import java.util.Scanner;

public class PhoneKeyPads {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter :");
		String str = input.next();

		char ch = str.toLowerCase().charAt(0);
		if (ch == 'a' || ch == 'b' || ch == 'c') {
			System.out.println("Corresponding digit 2");
		} else if (ch == 'd' || ch == 'e' || ch == 'f') {
			System.out.println("Corresponding digit 3");
		} else if (ch == 'g' || ch == 'h' || ch == 'i') {
			System.out.println("Corresponding digit 4");
		} else if (ch == 'j' || ch == 'k' || ch == 'l') {
			System.out.println("Corresponding digit 5");
		} else if (ch == 'm' || ch == 'n' || ch == 'o') {
			System.out.println("Corresponding digit 6");
		} else if(ch == 'p' || ch == 'q'  || ch == 'r' || ch == 's') {
			System.out.println("Corresponding digitm 7");
		} else if(ch == 't' || ch == 'u'  || ch == 'v') {
			System.out.println("Corresponding digit 8");
		}else if(ch == 'w' || ch == 'x'  || ch == 'y' || ch == 'z') {
			System.out.println("Corresponding digit 9");
		}else {
			System.out.println("Wrong entry !");
		}
	}
}
