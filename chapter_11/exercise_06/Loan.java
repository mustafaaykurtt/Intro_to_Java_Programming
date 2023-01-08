package chapter_11.exercise_06;

import java.util.Date;

public class Loan {
	private double annualInterestRate;
	private int year;
	private double loanAmount;
	private Date loanDate;
	
	private static double montlyInterestRate;

	public Loan() {
		this(2.5, 1, 100);
	}

	public Loan(double annualInterestRate, int year, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.year = year;
		this.loanAmount = loanAmount;
		this.loanDate = new Date();
		montlyInterestRate = annualInterestRate / 1200;
	}
	
	public double getMontlyAmount() {
		return ((loanAmount * montlyInterestRate)
		/ (1 - 1 / Math.pow(1 + montlyInterestRate, year * 12)));
	}
	
	public double getTotalPayment() {
		return getMontlyAmount() * 2;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String toString() {
		return "Muysata";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public static double getMontlyInterestRate() {
		return montlyInterestRate;
	}

	public static void setMontlyInterestRate(double montlyInterestRate) {
		Loan.montlyInterestRate = montlyInterestRate;
	}
}
