package chapter_06.exercise_14;

public class EstimateSeries {
	public static void main(String[] args) {
		
		System.out.println("i       m(i)");
		for (int i = 1 ; i < 13; i++) {
			System.out.print("_");
		}
		
		System.out.println();
		
		for (int i = 1; i < 902; i += 100) {

			System.out.printf("%-6d%3.4f\n" , i , getSeries(i));
		}
		
	}

	private static double getSeries(int seri) {
		double pi = 0;

		for (double i = 1; i <= seri; i++) {
			double divident = Math.pow(-1, (i + 1));
			double divider = (2 * i -1);
			
			pi +=  4 * (divident / divider);
		}
		
		
		return pi;
	}
}
