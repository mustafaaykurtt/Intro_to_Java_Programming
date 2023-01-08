package chapter_06.exercise_17;

import java.util.Scanner;

public class DisplayMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n:");
		int n  = input.nextInt();
		
		printMatris(n);
	}

	public static void printMatris(int n) {
		for(int row = 0; row < n; row++) {
			 for (int column = 0; column < n; column++) {
				 System.out.print((int)(Math.random() * 2) + " ");
			}
		System.out.println();	
		}
	}
}
