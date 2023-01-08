package chapter_06.exercise_21;

import java.util.Scanner;

public class PhoneKeypads {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		String str = input.next();
		String number = letterToNumber(str);
		System.out.println(number);
	}

	public static String letterToNumber(String str) {
		String number = "";
		int i = 0;
		int length = str.length();
		
		while (i < length) {
			char ch = str.toLowerCase().charAt(i);
			
			if (Character.isDigit(ch)) {
				number += ch;
			} else if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'b' || ch == 'c') {
					number += 2;
				} else if (ch == 'd' || ch == 'e' || ch == 'f') {
					number += 3;
				} else if (ch == 'g' || ch == 'h' || ch == 'i') {
					number += 4;
				} else if (ch == 'j' || ch == 'k' || ch == 'l') {
					number += 5;
				} else if (ch == 'm' || ch == 'n' || ch == 'o') {
					number += 6;
				} else if(ch == 'p' || ch == 'q'  || ch == 'r' || ch == 's') {
					number += 7;
				} else if(ch == 't' || ch == 'u'  || ch == 'v') {
					number += 8;
				}else if(ch == 'w' || ch == 'x'  || ch == 'y' || ch == 'z') {
					number += 9;
				}else {
					number += ""; 
				}
			} else {
				number += ch;
			}

			i++;
		}
		return number;
	}
}
