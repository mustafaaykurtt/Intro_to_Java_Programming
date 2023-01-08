package chapter_04.exercise_08;

import java.util.Scanner;

public class FindAsciiCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Ascii code");
		int asci = input.nextInt();

		if (0 <= asci && asci <= 127) {
			
			char a =(char) asci;
			System.out.println(a);
		}else {
			System.out.println("Out of the Asci");
		}
	}
}
