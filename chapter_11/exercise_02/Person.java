package chapter_11.exercise_02;

public class Person {
	private String name;
	private String adress;
	private String telephoneNumbers;
	private String eMail;
	
	public Person() {
		this("Unkown", "Unkown", "Unkown", "Unkown");
	}
	
	public Person (String name, String adress, String telephoneNumbers, String eMail) {
		this.name = name;
		this.adress = adress;
		this.telephoneNumbers = telephoneNumbers;
		this.eMail = eMail;
	}
	
	public String toString() {
		return "Name:" + name + "\nAdress:" + adress + "\nPhone:" + telephoneNumbers + "\nE-mail:" + eMail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephoneNumbers() {
		return telephoneNumbers;
	}

	public void setTelephoneNumbers(String telephoneNumbers) {
		this.telephoneNumbers = telephoneNumbers;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	
	
}
