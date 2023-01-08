package chapter_12.exercise_04;

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
		setAnnualInterestRate(annualInterestRate);
		setYear(year);
		setLoanAmount(loanAmount);
		loanDate = new Date();
		montlyInterestRate = annualInterestRate / 1200;
	}
	
	public double getMontlyAmount() {
		double a = ((loanAmount * montlyInterestRate) / (1 - 1 / Math.pow(1 + montlyInterestRate, year * 12)));
		return a;
	}
	
	public double getTotalPayment() {
		return getMontlyAmount() * 2;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate <= 0) {
			throw new IllegalArgumentException("Annual Interet Rate cannot be less than or equal to 0 !");
		}
		this.annualInterestRate = annualInterestRate;
	}
	
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year <= 0) {
			throw new IllegalArgumentException("Year cannot be less than or equal to 0 !");
		}
		this.year = year;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0) {
			throw new IllegalArgumentException("Loan Account cannot be less than or equal to 0 !");
		}
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
