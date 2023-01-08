package chapter_09.exercise_07;

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

}
