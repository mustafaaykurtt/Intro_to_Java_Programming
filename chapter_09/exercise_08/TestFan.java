package chapter_09.exercise_08;

public class TestFan {
	public static void main(String[] args) {
		final int SLOW = 1;		
		final int MEDIUM = 2;	
		final int FAST = 3;
		
		Fan fan1 = new Fan();
		System.out.println(fan1.toString());
		
		Fan fan2 = new Fan();
		fan2.setSpeed(FAST);
		fan2.setRadius(10);
		fan2.setColor("yellow");
		fan2.turnOn();
		
		System.out.println(fan2.toString());
	}
}
