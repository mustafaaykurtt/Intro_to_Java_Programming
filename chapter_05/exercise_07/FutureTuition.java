package chapter_05.exercise_07;

public class FutureTuition {
	public static void main(String[] args) {
		double fee = 10_000;
		double increase = 0.05;
		double tenthYear = 0;
		double afterFourYears = 0;
		
		for(int yil = 2; yil < 14 ; yil++) {
			
			fee += increase * fee;
			
			if(yil == 10) {
				tenthYear = fee;
			}
			
			if(yil > 10) {
				afterFourYears += fee ;
			}
		}
		
		System.out.printf("10 years of school fees: " + "%.3f\n",tenthYear);
		System.out.printf("Tuition for 4 years after 10 years: " + "%.3f" ,afterFourYears);
	}
}
