package chapter_12.exercise_11;

import java.io.*;
import java.util.Scanner;

public class InFileRemove2 {
	public static void main(String[] args) {
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
		
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(changeFile))) {
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

		String fileContent = sb.toString();
		fileContent = fileContent.replaceAll(delete, "");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(changeFile))) {
			bw.write(fileContent);
		} catch (IOException e) {
			System.out.println("An error occurred while writing the file");
			return;
		}

	}
}
