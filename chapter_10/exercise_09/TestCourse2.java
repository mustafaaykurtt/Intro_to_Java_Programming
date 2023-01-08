package chapter_10.exercise_09;

public class TestCourse2 {
	public static void main(String[] args) {
		Course2 course = new Course2();
		
		course.addStudents("Mustafa");
		course.addStudents("Kemal");
		course.addStudents("Ahmet");
		
		course.dropStudents("Mustafa");
		
		
		
		 course.clear();
		String[] courseArray = course.getStudents();
		 
		for (int i = 0; i < course.getNumberOfStudents() ; i++) {
			System.out.println(courseArray[i]);	
		}
	}
}
