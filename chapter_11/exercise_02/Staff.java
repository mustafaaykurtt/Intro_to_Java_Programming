package chapter_11.exercise_02;

public class Staff extends Employee {
	private String title;
	
	public Staff(String name, String adress, String telephoneNumbers, String eMail, int office,double salary, String title) {
		super(name, adress, telephoneNumbers, eMail, office, salary);
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTitle:" + getTitle();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
