package chapter_05.exercise_15;

public class DisplayAsciiCharacters {
	public static void main(String[] args) {
		
		for(int i = 33 , sayac = 1; i < 127; i++ , sayac++) {
			
			if(sayac % 10 == 0) {
				System.out.println((char)i);
			}else {
				System.out.print((char)i + " ");
			}
			
			
			
		}
	}
}
