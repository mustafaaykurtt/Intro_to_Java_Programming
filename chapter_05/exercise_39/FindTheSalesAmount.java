package chapter_05.exercise_39;

import java.util.Scanner;

public class FindTheSalesAmount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double targetCommission = 2700;
		double commission = 0;
		double balance;
		
		double salesAmount = 1;
		while( commission < targetCommission + 1) {
			balance = commission = 0;

			if (salesAmount > 10000)
				commission += (balance = salesAmount - 10000) * 0.12;

			if (salesAmount > 5000)
				commission += (balance -= balance - 5000) * 0.10;

			if (salesAmount > 0)
				commission += balance * 0.08;
			
			salesAmount += 1;
		}
		System.out.println((int)salesAmount);
	}
}
