package chapter_09.exercise_07;

public class TestAccountant {
	public static void main(String[] args) {
		Accountant accountant = new Accountant(1122, 20_000);
		accountant.setAnualInterestRate(4.5);

		accountant.withdraw(2500);
		accountant.deposit(3000);

		System.out.println("Id: " + accountant.getId() + "\nBalance: " + accountant.getBalance());
		System.out.printf("Montly Interest Rate: %.4f", accountant.getMontlyInterestRate());
		System.out.println("\nCreated Date: " + accountant.getDateCreated());
		
		Accountant accountant2 = new Accountant(1122, 20_000);
		
		System.out.println(accountant.toString());
		
	}
}
