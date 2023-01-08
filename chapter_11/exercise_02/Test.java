package chapter_11.exercise_02;

public class Test {
	public static void main(String[] args) {
		Person person = new Student("Mustafa", "Kemalpasa mah.", "0506971", "aykurt.@gmail.com", 4);
		Student student = (Student) person;
		System.out.println(student);
		
		System.out.println();
		
		Person person2 = new Employee("Ahmet", "Salim Bulvari", "0506784", "@gmmail.com", 2, 1525.62534);
		Employee employe = (Employee) person2;
		System.out.println(employe);
		
		System.out.println();
		
		Person person3 = new Faculty("Ahmet", "Salim Bulvari", "0506784", "@gmmail.com", 2, 1525.62534, "6pm-12am", "3");
		Employee faculty = (Faculty) person3;
		System.out.println(faculty);
		
		System.out.println();
		
		Person person4 = new Staff("Ahmet", "Salim Bulvari", "0506784", "@gmmail.com", 2, 1525.62534, "Professor");
		Employee staff = (Staff) person4;
		System.out.println(staff);
		
		
		
	}
}
