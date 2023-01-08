package chapter_05.exercise_10;

public class DivideFiveAndSix {
	public static void main(String[] args) {
		
		for(int i = 120 ,count = 1; i < 1001; i += 30 , count++) {
			if(count % 10 == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
