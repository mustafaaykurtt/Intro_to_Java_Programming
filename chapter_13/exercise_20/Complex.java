package chapter_13.exercise_20;

public class Complex implements Cloneable {
	private double a;
	private double b;

	public Complex() {
	}

	public Complex(double realPart) {
		this(realPart, 0);
	}

	public Complex(double realPart, double imaginaryPart) {
		this.a = realPart;
		this.b = imaginaryPart;
	}

	public Complex add(Complex secondComplex) {
		double resultRealPart = this.a + secondComplex.a;
		double resultImaginaryPart = this.b + secondComplex.b;
		return new Complex(resultRealPart, resultImaginaryPart);
	}

	public Complex substract(Complex secondComplex) {
		double resultRealPart = this.a - secondComplex.a;
		double resultImaginaryPart = this.b - secondComplex.b;
		return new Complex(resultRealPart, resultImaginaryPart);
	}

	public Complex multiply(Complex secondComplex) {
		return new Complex(a * secondComplex.a - b * secondComplex.b, b * secondComplex.a + a * secondComplex.b);
	}

	public Complex divide(Complex secondComplex) {
		return new Complex(
				(a * secondComplex.a + b * secondComplex.b) / (Math.pow(secondComplex.a, 2) + Math.pow(secondComplex.b, 2))  ,
				(b * secondComplex.a - a * secondComplex.b) / (Math.pow(secondComplex.a, 2) + Math.pow(secondComplex.b, 2)) );
	}

	public double abs() {
		return Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
	}
	
	@Override
	public Complex clone() throws CloneNotSupportedException {
		return (Complex)super.clone();
	}

	@Override
	public String toString() {
		return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
	}

	public double getRealPart() {
		return a;
	}

	public void setRealPart(double realPart) {
		this.a = realPart;
	}

	public double getImaginaryPart() {
		return b;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.b = imaginaryPart;
	}

}
