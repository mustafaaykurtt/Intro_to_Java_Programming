package chapter_06.exercise_01;

public class PentagonalNumbers {
	public static void main(String[] args) {
		System.out.println("ilk 100 besgensel sayi:");
		int pentagonal = getPentagonal(100);
	}

	private static int getPentagonal(int number) {
		
		
		for(int i = 1 ; i < number + 1; i++) {
			
			int pentagonal = (i * (3 * i - 1)) / 2;
			
			if(i % 10 == 0) {
				System.out.println(pentagonal );	
			} else {
			    System.out.printf("%5d   " , pentagonal);
			}
			
		}
		return 0;
		
	}
}
