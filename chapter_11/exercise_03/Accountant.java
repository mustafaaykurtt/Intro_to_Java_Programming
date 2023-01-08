package chapter_11.exercise_03;

import java.util.Date;

public class Accountant {
	private int id;
	private double balance;
	private double anualInterestRate;
	private Date dateCreated;

	public Accountant() {
		
	}

	public Accountant(int id, double balance) {
		this.id = id;
		this.balance = balance;
		anualInterestRate = 4.5;
		dateCreated = new Date();
	}
	
	public double withdraw(double out) {
		balance = balance - out;
		return balance;
	}

	public double deposit(double in) {
		balance = balance + in;
		return balance;
	}
	
	@Override
	public String toString() {
		return "Id:" + getId() + "\nBalance:" + getBalance() + "\nAnnual Interest Rate:" + getAnualInterestRate() + "\nCreated:" + getDateCreated();
	}
	
	public int getId() {
		return id;
	}
	
	public double getMontlyInterestRate() {
		return anualInterestRate / 1200;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnualInterestRate(double anualInterestRate) {
		this.anualInterestRate = anualInterestRate;
	}

	public double getAnualInterestRate() {
		return anualInterestRate;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}
