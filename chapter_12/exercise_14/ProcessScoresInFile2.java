package chapter_12.exercise_14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessScoresInFile2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the file containing the notes: ");
		String fileName = input.nextLine();
		input.close();

		File file = new File(fileName);
		if (!file.exists()) {
			System.out.println("File does not exist.!");
			return;
		}

		int count = 0;
		double sum = 0;

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			String line = bf.readLine();
			while (line != null) {
				String[] list = line.split("\\s+");

				count += list.length;
				for (String str : list) {
					sum += Integer.parseInt(str);
				}

				line = bf.readLine();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Total scores: " + sum);
		System.out.printf("Average scores: %.3f" ,(sum / count));

	}
}
