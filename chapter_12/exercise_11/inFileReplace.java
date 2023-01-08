package chapter_12.exercise_11;

import java.io.*;
import java.util.Scanner;

public class inFileReplace {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the phrase to be deleted from the file: ");
		String changeFile = input.nextLine();
		System.out.println("enter the file to be replaced:");
		String delete = input.nextLine();
		System.out.println("enter the file to be replaced:");
		String changed = input.nextLine();
		input.close();
		
		
		File file = new File(changeFile);
		if (!file.exists()) {
			System.out.println("File does not exist.!");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		try (BufferedReader bf = new BufferedReader(new FileReader(changeFile))) {
			String line = bf.readLine();
			
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = bf.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		} 
		
		String fileContent = sb.toString();
		fileContent.replaceAll(delete, changed);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(changeFile))) {
			bw.write(fileContent);
		} catch (IOException e) {
			System.out.println("An error occurred while writing the file");
			return;
		}
	}
}
