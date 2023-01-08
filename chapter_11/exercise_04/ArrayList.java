package chapter_11.exercise_04;

import java.util.Scanner;


public class ArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers(Entering 0 will terminate) :");
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		
		while(true) {
			int number = input.nextInt();
			if (number == 0) {
				break;
			} 
			
			list.add(number);
		}
		
		Integer max = java.util.Collections.max(list); 
		System.out.println("Array's max value:" + max);
	}
}
