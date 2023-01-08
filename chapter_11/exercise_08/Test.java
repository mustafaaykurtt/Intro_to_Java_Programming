package chapter_11.exercise_08;


public class Test {
	public static void main(String[] args) {
		Accountant account = new Accountant("Mehmet", 1, 500);
		account.setAnualInterestRate(1.5);

		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		

		System.out.println("       Account Summary");
		System.out.println("------------------------------------");
		System.out.println("Account holder name: " + account.getName());
		System.out.println("Interest rate: " + account.getAnualInterestRate());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.println("\n     List of transactions");
		System.out.println("------------------------------------");
		for (int i = 0; i < account.getTrans().size(); i++) { 
			System.out.println("Date: " + (account.getTrans()).get(i).getDate());
			System.out.println("Type: " + (account.getTrans()).get(i).getType());
			System.out.println("Amount: " + (account.getTrans()).get(i).getAmount());
			System.out.println("Balance: " + (account.getTrans()).get(i).getBalance());
			System.out.println("Description: " + (account.getTrans()).get(i).getDescription());
			System.out.println();
		}
	}
}
