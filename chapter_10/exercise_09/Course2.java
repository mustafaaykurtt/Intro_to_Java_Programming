package chapter_10.exercise_09;

public class Course2 {
	private String name;
	private String[] students;
	private int numberOfStudents;
	private int capacity;

	private static final int defaultCapacity = 2;

	public Course2() {
		capacity = defaultCapacity;
		students = new String[capacity];
	}
	
	public Course2(String name, int capacity) {
		this.name = name;
		students = new String[capacity];
	}

	public void addStudents(String name) {
		if (numberOfStudents >= capacity) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents++] = name;
	}

	public void dropStudents(String name) {
		int index = -1;
		for (int i = 0; i < students.length ; i++) {
			if (students[i].equals(name)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			throw new RuntimeException("Student is have not!");
		}

		for (int i = index; i < numberOfStudents - 1; i++) {
			students[i] = students[i + 1];
		}
		
		numberOfStudents--;
	}
	
	public void clear() {
		for (int i = 0; i < students.length; i++) {
			numberOfStudents = 0;
		}
		System.out.println("Don't have a student");
	}

	public String getName() {
		return name;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

}

