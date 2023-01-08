package chapter_07.exercise_04;

import java.util.Scanner;

public class AnalyzeScores {

	public static void main(String[] args) {
		
		double[] array = new double[100];
		enterScoreAndAnalyze(array);
		
	}

	private static void enterScoreAndAnalyze(double[] array) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter grades (no more than 100 grades):");
		double score = 1;
		int numberOfStudent = 0;
		double sum = 0;
		
		while(score > -1) {
			System.out.print((numberOfStudent + 1) + ". score of student: ");
			score = input.nextDouble();
			array[numberOfStudent] = score;
			if(score > -1) {
			sum += score;
			numberOfStudent++;
			}
		}
		scoreAnalyze(array, numberOfStudent , sum);
	}

	public static void scoreAnalyze(double[] array, int numberOfStudent, double total) {
		double average = total / numberOfStudent;
		int top = 0;
		int equal = 0;
		int low = 0;
		
		for (int i = 0; i < numberOfStudent ; i++) {
			if(array[i] > average) {
				top++;
			} else if(array[i] == average) {
				equal++;
			} else {
				low++;
			}
		}
		System.out.print("Number of students above average: " + top + "\n"
					   + "Number of students equal to the average: " + equal + "\n"	
					   + "Number of students below average: " + low + "\n");
	}

}
