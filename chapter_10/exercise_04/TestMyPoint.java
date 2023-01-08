package chapter_10.exercise_04;

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint myPoint = new MyPoint();
		double a = myPoint.distance(10, 10.35);
		System.out.println(a);
		
		System.out.println(myPoint.distance(12,45));
		
	}
}
