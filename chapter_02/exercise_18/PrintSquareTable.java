package chapter_02.exercise_18;

import java.util.Scanner;

public class PrintSquareTable {
	public static void main(String[] args) {
		System.out.println("a         b        pow(a.b)");
		int a = 1;
		int b = 2;
		int square  = (int)  Math.pow(a, b);
		
		System.out.println( a + "         " +  b + "        " +  square);
		
		 a = 2;
		 b = 3;
		 square  = (int)  Math.pow(a, b);
		
		System.out.println( a + "         " +  b + "        " +  square);
		
		 a = 3;
		 b = 4;
		 square  = (int)  Math.pow(a, b);
		
		System.out.println( a + "         " +  b + "        " +  square);
		
		 a = 4;
		 b = 5;
		 square  = (int)  Math.pow(a, b);
		
		System.out.println( a + "         " +  b + "        " +  square);
		
		 a = 5;
		 b = 6;
		 square  = (int)  Math.pow(a, b);
		
		System.out.println( a + "         " +  b + "        " +  square);
		
		
		
	}
}
