package chapter_10.exercise_07;

import java.util.Scanner;

import chapter_09.exercise_07.Accountant;

public class Atm {
	public static void main(String[] args) {
		Accountant[] user = new Accountant[10];
		for (int i = 0; i < user.length; i++) {
			user[i] = new Accountant(i, 1000);
		}

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an id:");

		int id = input.nextInt();
		boolean go = false;

		while (go == false) {
			if (1 > id || id > 9) {
				idControl(input, id);
			}

			if (id == user[id].getId()) {
				menu(id);
				int choice = input.nextInt();

				switch (choice) {
				case 1:
					System.out.println("The balance is: " + user[id].getBalance());
					break;
				case 2:
					System.out.print("Enter an amount to windraw: ");
					int windraw = input.nextInt();
					user[id].withdraw(windraw);
					System.out.println("New balance: " + user[id].getBalance());
					break;
				case 3:
					System.out.print("Enter an amount to deposit: ");
					int deposit = input.nextInt();
					user[id].deposit(deposit);
					System.out.println("New balance: " + user[id].getBalance());
					break;
				case 4:
					System.out.println("Exit");
					System.out.println("Enter an ID");
					id = input.nextInt();
					break;
				}
			}
		}
	}
	
	public static void menu(int id) {
		System.out.print("\nMain menu\n" + 
						   "1: Check Balance\n" +
						   "2: Withdraw\n" +
						   "3: Deposit\n" +
						   "4: Exit\n" +
						   "Enter the choice: ");
	}
	
	public static int idControl(Scanner input, int id) {
		while(1 > id || id > 9) {
			System.out.println("Please enter an ID between 1 and 9");
			id = input.nextInt();	
		}
		return id;
	}
}
