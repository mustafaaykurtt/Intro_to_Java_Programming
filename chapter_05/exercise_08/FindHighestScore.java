package chapter_05.exercise_08;

import java.util.Scanner;

public class FindHighestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String student = "";
		int first = 0;

		System.out.print("Enter class size:  ");
		int numberOfStudents = input.nextInt();

		for (int count = 0; count < numberOfStudents; count++) {
			System.out.println();
			System.out.print("Student name : ");
			String isim = input.next();
			System.out.print("Score : ");
			int score = input.nextInt();

			if (score > first) {
				first = score;
				student = isim;
			}
																																																			
		}
		System.out.println("The student with the highest score : " + student);
	}
}
