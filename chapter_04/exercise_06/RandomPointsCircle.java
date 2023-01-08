package chapter_04.exercise_06;

public class RandomPointsCircle {
	public static void main(String[] args) {

		final int RADIUS = 40;
		double angle1 = Math.random() * (2 * Math.PI);
		double angle2 = Math.random() * (2 * Math.PI);
		double angle3 = Math.random() * (2 * Math.PI);

		double x1 = RADIUS * Math.cos(angle1);
		double y1 = RADIUS * Math.sin(angle1);
		double x2 = RADIUS * Math.cos(angle2);
		double y2 = RADIUS * Math.sin(angle2);
		double x3 = RADIUS * Math.cos(angle3);
		double y3 = RADIUS * Math.sin(angle3);

		double a = Math.sqrt((x3 - x2) * (x3 - x2) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		System.out.println("acılar ;" + (Math.round(A * 100) / 100.0) + " " + (Math.round(B * 100) / 100.0)
				+ " " +(Math.round(C * 100) / 100.0));

	}
}
