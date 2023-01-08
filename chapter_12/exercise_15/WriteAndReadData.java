package chapter_12.exercise_15;

import java.io.*;
import java.util.*;

public class WriteAndReadData {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the file name to be created:");
		String fileName = "src//chapter_12//exercise_15//" + input.nextLine();
		File file = new File(fileName);
		input.close();

		if (file.createNewFile()) {
			System.out.println("File reated successfully");
		} else {
			System.out.println("File alreadt exists.");
		}

		try (
				PrintWriter output = new PrintWriter(file);)
			{
			for (int i = 0; i < 100; i++) {
				output.print(((int) (Math.random() * 500) + 1));
				output.print(" ");
			}
		}

		ArrayList<Integer> list = new ArrayList<>();

		try (Scanner input1 = new Scanner(file);) {
			while (input1.hasNext()) {
				list.add(input1.nextInt());
			}
		}

		Collections.sort(list);
		System.out.println(list.toString());
	}
}
