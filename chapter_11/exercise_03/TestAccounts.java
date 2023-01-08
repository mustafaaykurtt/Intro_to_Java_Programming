package chapter_11.exercise_03;

public class TestAccounts {
	public static void main(String[] args) {
		Accountant accountant = new CheckingAccount(1, 100, 10);
		
		System.out.println(accountant.withdraw(82) + "\n");
		System.out.println(accountant.toString());
		
		Accountant accountant2 = new SavingsAccountant(2, 50);
		System.out.println(accountant2.withdraw(30));
	}
}
