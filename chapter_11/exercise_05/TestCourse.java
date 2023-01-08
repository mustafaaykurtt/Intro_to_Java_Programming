package chapter_11.exercise_05;

public class TestCourse {
	public static void main(String[] args) {
		Course course = new Course();
		course.addStudents("Ahmet");
		course.addStudents("Selim");
		course.addStudents("Mustafa");
		course.printCourse();
		course.dropStudents("Mustafa");
		course.printCourse();
		System.out.println(course.getSize());
		
	}
}
