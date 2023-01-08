package chapter_05.exercise_06;

public class MilToKmAndKmToMil {
	public static void main(String[] args) {
		final double MİL_TO_KM = 1.609;
		System.out.println("MIL      KILOMETRE     |     KİLOMETRE      MIL");
	
		for(int mil = 1 , km = 20; (mil < 11 && km < 66); mil++ , km += 5) {
			System.out.printf("%-9d %7.3f" , mil , (mil * MİL_TO_KM));
			System.out.print("      |     ");
			System.out.printf("%-10d %9.3f\n" , km , (km / MİL_TO_KM));
		
		}
	
	}
}

