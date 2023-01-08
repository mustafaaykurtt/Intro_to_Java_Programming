package chapter_05.exercise_25;

public class ComputePI {
	public static void main(String[] args) {
		double pi = 0;
		
		for(int i = 1; i < 10_001 ; i++) {
			
			double divident = Math.pow(-1, (i + 1));
			double divider = (2 * i -1);
			
			pi +=  4 * (divident / divider);
			
		}
		System.out.println(pi);
	}
}
