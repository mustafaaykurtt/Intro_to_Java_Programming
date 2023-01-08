package chapter_04.exercise_12;

import java.util.Scanner;

public class HexToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the hexadecimal number : ");
		String str = input.next();
		
		char ch = str.charAt(0);
		
		if (Character.isDigit(ch) && 0 <= ch && ch <= 9) {
			int a = ch % 2;
			int divide = ch / 2;
			int b = divide % 2;
			divide /= 2;
			int c = divide % 2;
			divide /= 2;
			int d = divide % 2;
			 System.out.println(d + "" + c + "" + b + "" + a + "");
		}else if('A' <= ch && ch <= 'F') {
			int ch1 = ch - 'A' + 10;
			System.out.println(ch1);
			int a = ch1 % 2;    
			int bolum = ch1 / 2; 
			int b = bolum % 2;  
			bolum /= 2;			
			int c = bolum % 2;	
			bolum /= 2;			
			int d = bolum % 2;	
			 System.out.println(d + "" + c + "" + b + "" + a + "");
		}else {
			System.out.println("You entered wrong");
		}
	}
}
