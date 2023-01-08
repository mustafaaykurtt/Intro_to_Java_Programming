package chapter_11.exercise_03;

public class SavingsAccountant extends Accountant {

	public SavingsAccountant() {
		super();
	}

	public SavingsAccountant(int id, double balance) {
		super(id, balance);
	}
	
	 @Override
		public double withdraw(double out) {
			if ((out > super.getBalance()) ) {
				throw new RuntimeException("Error! Amount exceeds balance limits!");
			} else {
				super.setBalance(getBalance() - out);
				return super.getBalance();
			}
		}
	
}
