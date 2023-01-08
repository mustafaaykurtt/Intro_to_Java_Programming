package chapter_03.exercise_14;

import java.util.Scanner;

public class HeadingOrTails {
	public static void main(String[] args) {
	int headsOrTails =(int)((Math.random() * 2) );
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter (1 = heads or 0 = tails) select:");
	int in = input.nextInt();
	
	System.out.println(headsOrTails == in ? "True" : "False");
	
	}
}
