package chapter_12.exercise_30;

import java.io.*;
import java.util.Scanner;

public class Exercise_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file name:");
		String fileName = input.nextLine();
		input.close();

		File file = new File(fileName);
		if (!file.exists()) {
			System.out.println("File does not exist.!");
			return;
		}

		int[] count = new int[26];

		try (BufferedReader bf = new BufferedReader(new FileReader(fileName));) {
			String line = bf.readLine();
			while (line != null) {
				countLetter(count, line);
				line = bf.readLine();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		printLetter(count);
	}

	public static void printLetter(int[] count) {
		for (int i = 0; i < count.length; i++) {
			char ch = (char) (i + 'A');
			System.out.println(ch + " " + count[i]);
		}
	}

	public static void countLetter(int[] count, String line) {
		for (int i = 0; i < line.length(); i++) {
			int letter = Character.toUpperCase(line.charAt(i));
			if (letter >= 'A' && letter <= 'Z') {
				count[letter - 'A']++;
			}
		}
	}

}
