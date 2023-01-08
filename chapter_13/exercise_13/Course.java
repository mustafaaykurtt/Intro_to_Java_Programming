package chapter_13.exercise_13;

import java.util.ArrayList;

public class Course implements Cloneable{
	private ArrayList<String> students;

	public Course() {
		students = new ArrayList<>();
	}
	
	public Course(ArrayList<String> students) {
		this.students = students;
	}

	public void addStudents(String name) {
		students.add(name);
	}

	public void dropStudents(String name) {
	if (students.contains(name) == false) {
		throw new RuntimeException("Student not found");
	} 
	students.remove(name);
	}
	
	public Object clone() {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < this.getStudents().size(); i++) {
			list.add(this.students.get(i));
		}
		return new Course(list);
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}
	
	public String toString() {
		return students.toString();
	}
}
