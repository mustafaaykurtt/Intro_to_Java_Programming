package chapter_06.exercise_23;

import java.util.Scanner;

public class OccuruencesOfSpeciedCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the text and its repeating character:");
		String str1 = input.nextLine();
		
		int k = str1.indexOf(",");
		String str2 = str1.substring (0 , k);
		char ch = str1.charAt(k + 2);
		System.out.println("There are " + count(str2 ,ch));
	}
	
	public static int count(String str, char a) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (a == str.charAt(i))
				count++;
		}
		return count;
	}
}
