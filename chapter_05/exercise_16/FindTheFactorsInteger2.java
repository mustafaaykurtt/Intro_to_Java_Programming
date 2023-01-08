package chapter_05.exercise_16;

import java.util.Scanner;

public class FindTheFactorsInteger2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		int count = 2;

		while (number / count != 1) {

			if (number % count == 0) {
				System.out.print(count + ",");
				number /= count;
			} else {
				count++;
			}
		}
		System.out.println(number);
	}
}
