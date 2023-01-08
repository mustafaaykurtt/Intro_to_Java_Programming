package chapter_05.exercise_03;

public class KgToPaunds {
	public static void main(String[] args) {
		System.out.println("Kilogram       Pounds");
		double kgToPound = 2.2;
		double pound = 1;
		
		for(int kg = 1; kg < 200; kg += 2) {
			pound = kg * kgToPound;
			System.out.printf(kg + "          " + "\t%.1f \n" , pound );
		}
		
	}
}
