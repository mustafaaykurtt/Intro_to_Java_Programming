package chapter_11.exercise_13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Please enter numbers: ");
		
		for (int i = 0; i < 10; i++) {
			int number = input.nextInt();
			if (!list.contains(number)) {
				list.add(number);
			}
		}
		
		System.out.println(list);
	}
}
