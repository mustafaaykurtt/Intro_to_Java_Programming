package chapter_12.exercise_19;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Exercise_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String urlString = input.next();
		input.close();
		
		int countWord = 0;
		
		try {
			
			URL url = new URL(urlString);
			BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
			while (bf.readLine() != null) {
				String[] words = bf.readLine().split(" ");
				countWord += words.length;
			}
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Total word count: " + countWord);
	}
}
