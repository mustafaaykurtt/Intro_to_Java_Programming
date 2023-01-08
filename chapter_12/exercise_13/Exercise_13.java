package chapter_12.exercise_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_13 {
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
		
		try (FileReader fileReader = new FileReader(file)) {
		      BufferedReader reader = new BufferedReader(fileReader);

		      int characterCount = 0;
		      int wordCount = 0;
		      int lineCount = 0;

		      String line = reader.readLine();
		      
		      while (line != null) {
		        lineCount++;

		        String[] words = line.split("//s+"); // for multiple spaces
		        wordCount += words.length;

		        for (String word : words) {
		          characterCount += word.length();
		        }

		        line = reader.readLine();
		      }

		      System.out.println("Karakter sayısı: " + characterCount);
		      System.out.println("Kelime sayısı: " + wordCount);
		      System.out.println("Satır sayısı: " + lineCount);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}
}
