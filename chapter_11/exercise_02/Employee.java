package chapter_11.exercise_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person{
	private int office;
	private double salary;
	private LocalDate dateHired;
	
	public Employee(String name, String adress, String telephoneNumbers, String eMail, int office, double salary) {
		super(name, adress, telephoneNumbers, eMail);
		this.office = office;
		this.salary = salary;
		this.dateHired = LocalDate.now();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\noffice: " + getOffice() + "\nSalary: " + getSalary() + "\nDateHired: " + getDateHired();
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public String getSalary() {
		return String.format("%.2f", salary);
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		DateTimeFormatter myFormatObject = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formatDateHired = dateHired.format(myFormatObject);  
		return formatDateHired;
	}
}
