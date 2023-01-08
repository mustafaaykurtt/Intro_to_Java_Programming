package chapter_07.exercise_17;

import java.util.Scanner;

public class SortStudents {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students:");
		int numberOfStudents = input.nextInt();
		
		String[] studentName = new String[numberOfStudents];
		int[] score = new int[numberOfStudents];
		
		
		userAssignment(input, studentName, score);
		sortScore(score , studentName);
		printArray(score,studentName);
		
	}
	
	public static void printArray(int [] score ,String[] studentName) {

		for (int i = 0; i < studentName.length; i++) {
			System.out.println(studentName[i] + ": " + score[i]);
		}
			
	}

	private static void sortScore(int[] score , String[] name) {
		
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if(score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					
					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
				}
			}
		}
		
	}

	public static void userAssignment(Scanner input, String[] name, int[] score) {
		for (int i = 0; i < score.length; i++) {
			 System.out.println();
			
			System.out.print("Enter studen name and last name:");
			 name[i] = input.nextLine();
			 
			System.out.print("Enter the score:");
			 score[i] = input.nextInt();
		}
	}

	
}
