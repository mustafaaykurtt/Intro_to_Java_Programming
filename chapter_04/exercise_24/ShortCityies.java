package chapter_04.exercise_24;

import java.util.Scanner;

public class ShortCityies {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three city names :");
		String city1 = input.next();
		String city2 = input.next();
		String city3 = input.next();
		
		int a = city1.compareToIgnoreCase(city2);
		int b = city1.compareToIgnoreCase(city3);
		int c = city2.compareToIgnoreCase(city3);
		
		if (a > 0 && b > 0 && c > 0) {
			System.out.println(city3 + " " + city2 + " " + city1  );
		
		} else if(a > 0 && b > 0 && c < 0) {
			System.out.println(city2 + " " + city3 + " " + city1  );
		
		}else if(a < 0 && b > 0 && c > 0) {
			System.out.println(city3 + " " + city1 + " " + city2  );
		
		}else if(a < 0 && b < 0 && c > 0) {
			System.out.println(city1 + " " + city3 + " " + city2  );
		
		}else if(a > 0 && b < 0 && c < 0) {
			System.out.println(city2 + " " + city1 + " " + city3  );
		
		}else if(a < 0 && b < 0 && c < 0) {
			System.out.println(city1 + " " + city2 + " " + city3  );
		}
		
		
		
		
		
		
	}
	
	
}
