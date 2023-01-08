package chapter_12.exercise_14;

import java.io.File;
import java.util.Scanner;

public class ProcessScoresInFile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the file containing the notes: ");
		String fileName = input.nextLine();
		input.close();
		
		File file = new File(fileName);
		if(!file.exists()) {
			System.out.println("File does not exist.!");
			return;
		}
		
		int count = 0;
		double sum = 0;
		
		try (Scanner inputFile = new Scanner(file)) {
			
			while (inputFile.hasNext()) {
				sum += inputFile.nextInt();
				count++;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Total scores: " + sum);
		System.out.println("Average scores: " + sum / count);
		
	}
}
