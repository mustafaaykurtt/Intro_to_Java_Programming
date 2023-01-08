package chapter_05.exercise_23;

public class DemonstrateCancellationErrors {
	public static void main(String[] args) {
		double divident = 1;
		double totalLeft = 0;
		double totalRight = 0;
		
		
		for(double dividerLeft = 1 , dividerRight = 50000; dividerLeft < 50000 && dividerRight > 0 ; dividerLeft++ , dividerRight--) {
			 totalLeft += (divident / dividerLeft);
			 totalRight += (divident / dividerRight);
		}
	System.out.println(totalLeft);
	System.out.println(totalRight);
	}
	
}
