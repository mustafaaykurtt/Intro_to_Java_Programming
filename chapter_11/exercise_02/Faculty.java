package chapter_11.exercise_02;

public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	public Faculty(String name, String adress, String telephoneNumbers, String eMail, int office, double salary, String officeHours, String rank) {
		super(name, adress, telephoneNumbers, eMail, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nOffice Hours:" + getOfficeHours() + "\nRank:" + getRank();
	}
	
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
}
