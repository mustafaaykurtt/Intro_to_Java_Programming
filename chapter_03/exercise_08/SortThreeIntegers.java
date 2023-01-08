package chapter_03.exercise_08;

import java.util.Scanner;

public class SortThreeIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("lutfen 3 adet sayi giriniz:");

		int s1 = input.nextInt();
		int s2 = input.nextInt();
		int s3 = input.nextInt();
		int temp;

		if (s1 > s2 || s1 > s3) {
			if (s1 > s2) {
				temp = s2;
				s2 = s1;
				s1 = temp;
			}
			if (s1 > s3) {
				temp = s3;
				s3 = s1;
				s1 = temp;
			}
		}
		if (s2 > s3) {
			temp = s3;
			s3 = s2;
			s2 = temp;
		}

		System.out.println(s1 + " < " + s2 + " < " + s3);
	}
}
