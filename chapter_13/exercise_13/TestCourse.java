package chapter_13.exercise_13;


public class TestCourse {
	public static void main(String[] args) {
		Course course = new Course();
		course.addStudents("Ahmet");
		course.addStudents("Mustafa");
		course.addStudents("Kemal");
		course.addStudents("Selim");
		course.addStudents("Yesim");
		course.addStudents("Mahmut");
		
		Course course1 = (Course)course.clone();
		course1.dropStudents("Ahmet");
		course1.dropStudents("Mustafa");
		
		course.getStudents().trimToSize();
		course1.getStudents().trimToSize();
		
		System.out.println(course);
		System.out.println(course1);
	}
}
