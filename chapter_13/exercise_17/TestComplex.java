package chapter_13.exercise_17;

public class TestComplex {
	public static void main(String[] args) {
		Complex c = new Complex(3.5, 5.5);
		Complex c1 = new Complex(-3.5, 1);
		
		System.out.println("Total: " + c.add(c1));
		System.out.println("Subscribe: " + c.substract(c1));
		System.out.println("Multiply: " + c.multiply(c1));
		System.out.println("Divide: " + c.divide(c1));
		
	}
}
