package chapter_11.exercise_05;

import java.util.ArrayList;

public class Course {
	private String name;
	public ArrayList<String> list2 = new ArrayList<>();


	public Course() {
		
	}

	public void addStudents(String name) {
		list2.add(name);
	}

	public void dropStudents(String name) {
		if (list2.contains(name) == false) {
			throw new RuntimeException("Student not found");
		}
		
		list2.remove(name);
	}

	public void printCourse() {
		System.out.println(list2);
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return list2.size();
	}

}
