package chapter_12.exercise_11;

import java.io.*;
import java.util.*;

public class inFileRemove {
	public static void main(String[] args) throws Exception {
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("The phrase to be deleted from the file: ");
		String changeFile = input1.nextLine();
		System.out.println("enter the file to be replaced:");
		String delete = input1.nextLine();
		input1.close();

		File file = new File(changeFile);
		if (!file.exists()) {
			System.out.println("File does not exist");
			return;
		}

		ArrayList<String> s2 = new ArrayList<>(); 
		try (
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				String s1 = input.nextLine();
				s2.add(removeString(delete, s1));
			}
		}

		try (
			PrintWriter output = new PrintWriter(file);
		) {
			for (int i = 0; i < s2.size(); i++) {
				output.println(s2.get(i));
			}
		}
	}

	public static String removeString(String delete, String line) {
		StringBuilder str = new StringBuilder(line);
		int start = str.indexOf(delete); // Start index
		int end = delete.length(); // End index

		while (start >= 0) {
			end = start + end;
			str = str.delete(start, end);
			start = str.indexOf(delete, start); 
		}

		return str.toString();
	}
}
