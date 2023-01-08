package chapter_11.exercise_03;

public class CheckingAccount extends Accountant {
	private int overDraft;
	
	public CheckingAccount() {
		super();
		overDraft = -20;
	}
	
	public CheckingAccount(int id, double balance, int overDraft) {
		super(id, balance);
		this.overDraft = overDraft;
	}
	
	 @Override
	public double withdraw(double out) {
		if ((super.getBalance() - out) < overDraft) {
			throw new RuntimeException("Error! Amount exceeds overdraft limits!");
		} else {
			super.setBalance(getBalance() - out);
			return super.getBalance();
		}
	}
	 
	 @Override
	 public String toString() {
		 return super.toString() + "\nOverdraft limit: $" + getOverDraft();
	 }

	public int getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(int overDraft) {
		this.overDraft = overDraft;
	}
	 
	 
}
