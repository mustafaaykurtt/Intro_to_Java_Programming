package chapter_12.exercise_12;

import java.io.*;
import java.util.*;

public class Exercise_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file: ");
		String fileName = input.nextLine();
		input.close();

		File file = new File(fileName);
		if (!file.exists()) {
			System.out.println("File does not exist.!");
			return;
		}

		ArrayList<String> list = new ArrayList<>();
		String s1 = "";
		String s2 = "";

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			s1 = bf.readLine();
			while (s1 != null) {
				s2 = bf.readLine();
				if (s2 != null && s2.length() > 0 && s2.charAt(s2.length() - 1) == '{') {
					list.add(s1 + ("{"));
					s1 = bf.readLine();
				} else {
					list.add(s1);
					s1 = s2;
				}
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading " + e.getMessage());
		}

		try (PrintWriter output = new PrintWriter(file);) {
			for (int i = 0; i < list.size(); i++) {
				output.println(list.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred while writing " + e.getMessage());
		}
	}
}
