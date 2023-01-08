package chapter_11.exercise_02;

public class Student extends Person {
	private int status;

	public Student(String name, String address, String telephoneNumbers, String email, int status) {
		super(name, address, telephoneNumbers, email);
		this.status = status;
	}

	public String getStatus() {
		switch (status) {
			case (1) : return "Freshman";
			case (2) : return "Sophomore";
			case (3) : return "Junior";
			case (4) : return "Senior";
			default : return "Unkown";
		}
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nStatus:" + getStatus();
	}

}
