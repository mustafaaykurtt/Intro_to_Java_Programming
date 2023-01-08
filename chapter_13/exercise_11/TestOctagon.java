package chapter_13.exercise_11;

public class TestOctagon {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon = new Octagon(12);
		Octagon octagon1 = (Octagon) octagon.clone();
		
		System.out.println(octagon);
		System.out.println(octagon1);
		
		System.out.println(octagon.compareTo(octagon1));
	}
}
