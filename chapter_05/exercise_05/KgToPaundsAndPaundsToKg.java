package chapter_05.exercise_05;

public class KgToPaundsAndPaundsToKg {
	public static void main(String[] args) {
		
		final double KG_TO_POUND = 2.2;
		
		System.out.println("Kilogram        Pounds    |    Pounds        Kilogram");
		
		for(int kg = 1 , pound = 20; (kg < 200 && pound < 516); kg += 2 , pound += 5) {
			System.out.printf("%-12d %9.1f",kg , (kg * KG_TO_POUND));
			System.out.print("    |    ");
			System.out.printf("%-10d %11.2f\n" , pound , (pound / KG_TO_POUND));
			}
	}
}
