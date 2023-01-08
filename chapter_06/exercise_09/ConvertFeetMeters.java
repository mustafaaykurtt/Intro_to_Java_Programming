package chapter_06.exercise_09;

public class ConvertFeetMeters {
public static void main(String[] args) {
		
		System.out.println("Feet        Meters     |       Meters          Feet");
		
		for(double i = 0; i < 58; i++ ) {
			System.out.print("_");
		}
		
		System.out.println();
		System.out.println();
		
		for(double i = 1 , j = 20; i < 11  && j < 66 ; i++ , j += 5) {
			System.out.printf("%-9.1f%8.3f", i , getFeetToMeters(i));
			System.out.print("      |        ");
			System.out.printf("%-12.1f%8.3f\n" , j , getMetersToFeet(j) );
		}
		
		
	}

	private static double getFeetToMeters(double j) {
		return 0.305 * j;
	}

	private static double getMetersToFeet(double i) {
		return 3.279 * i;
	}
}
