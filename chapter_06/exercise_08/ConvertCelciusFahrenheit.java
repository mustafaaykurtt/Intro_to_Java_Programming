package chapter_06.exercise_08;


public class ConvertCelciusFahrenheit {
	public static void main(String[] args) {
		
		System.out.println("Celsius        Fahrenheit   |   Fahrenheit        Celsius");
		
		for(double i = 0; i < 58; i++ ) {
			System.out.print("_");
		}
		
		System.out.println();
		System.out.println();
		
		for(double i = 40 , j = 120; i > 30 && j > 29 ; i-- , j -= 10) {
			System.out.printf("%-14.1f%8.1f", i , getCelcToFahren(i));
			System.out.print("      |   ");
			System.out.printf("%-14.1f%10.1f\n" , j , getFahrenToCelc(j) );
		}
		
		
	}

	private static double getFahrenToCelc(double j) {
		return (5.0 / 9) * (j - 32);
	}

	private static double getCelcToFahren(double i) {
		return (9.0 / 5) * i + 32;
	}
}
