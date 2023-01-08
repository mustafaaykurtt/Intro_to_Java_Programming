package chapter_13.exercise_06;

public class TestComparableCircle {
	public static void main(String[] args) {
		ComparableCircle circle1 = new ComparableCircle(12.5);
		ComparableCircle circle2 = new ComparableCircle(18.3);

		System.out.println("\nComparableCircle1:");
		System.out.println(circle1);
		System.out.println("\nComparableCircle2:");
		System.out.println(circle2);

		System.out.println((circle1.compareTo(circle2) == 1 ? "\nComparableCircle1 " : "\nComparableCircle2 ")
				+ "is the larger of the two Circles");
	}
}
