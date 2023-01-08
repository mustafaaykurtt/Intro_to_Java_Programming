package chapter_13.exercise_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

	public ComparableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public int compareTo(ComparableCircle o) {
		if (super.getArea() > o.getArea()) {
			return 1;
		} else if (super.getArea() < o.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}
}
