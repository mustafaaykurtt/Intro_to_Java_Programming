package chapter_11.exercise_08;

import java.util.ArrayList;
import java.util.Date;

public class Accountant {
	private int id;
	private String name;
	private double balance;
	private double anualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> trans = new ArrayList<>();
	

	public Accountant() {
		
	}

	public Accountant(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		anualInterestRate = 4.5;
		dateCreated = new Date();
	}
	
	public void withdraw(double out) {
		balance -= out; 
		trans.add(new Transaction('W', out, balance, "-Withdrawal from account"));
	}

	public void deposit(double in) {
		balance += in;
		trans.add(new Transaction('D', in, balance, "+Deposit to account"));
		
	}
	
	@Override
	public String toString() {
		return "Id:" + getId() + "\nBalance:" + getBalance() + "\nAnnual Interest Rate:" + getAnualInterestRate() + "\nCreated:" + getDateCreated();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ArrayList<Transaction> getTrans() {
		return trans;
	}

	public void setTrans(ArrayList<Transaction> trans) {
		this.trans = trans;
	}
	
	

}
