package chapter_06.exercise_13;

public class SumSeries {

	public static void main(String[] args) {

		System.out.println("i        m(i)");

		for (int i = 1; i < 21; i++) {

			System.out.printf("%-8d%4.4f\n" , i , getSeries(i));
		}
	}

	private static double getSeries(double series) {
		double toplam = 0;

		for (double i = 1; i <= series; i++) {
			
			toplam += i / (i + 1); 

		}

		return toplam;
	}

}
