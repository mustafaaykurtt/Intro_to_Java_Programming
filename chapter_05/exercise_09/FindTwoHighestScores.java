package chapter_05.exercise_09;

import java.util.Scanner;

public class FindTwoHighestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String student1 = "";
		String student2 = "";
		int first = 0;
		int second = 0;

		System.out.print("Enter class size:  ");
		int numberOfStudent = input.nextInt();

		for (int count = 0; count < numberOfStudent; count++) {
			System.out.println();
			System.out.print("Enter student name : ");
			String name = input.next();
			System.out.print("Enter score: ");
			int score = input.nextInt();

			if (count == 0) {
				first = score;
				student1 = name;
			} else if (count == 1 && score > first) {
				second = first;
				first = score;
				student2 = student1;
				student1 = name;
			} else if (count == 1 ) {
				second = score;
				student2 = name;
			}else if (count > 1 && score > first && score > second) {
				second = first;
				first = score;
				student2 = student1;
				student1 = name;
			} else if(count > 1 && score > second) {
				second = score;
				student2 = name;
			}
		}
		System.out.println("The student with the highest score: " + student1 + " Score: " + first);
		System.out.println("The 2nd student with the highest score: " + student2 + " Score: " + second );
	}
}
