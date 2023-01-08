package chapter_05.exercise_04;

public class MilToKm {
	public static void main(String[] args) {
		System.out.println("Mil    Kilometre");
		double milToKm = 1.609;
		double km = 1;
		
		for(int mil = 1; mil < 11; mil++) {
			km = mil * milToKm;
			System.out.printf(mil + "      " + "%.3f \n" , km );
		}
		
	}
}
