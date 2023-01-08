package chapter_06.exercise_12;

public class PrintAsciiMethod {
	public static void main(String[] args) {
		
		int a = 'A';
		int b = 'Z';
		
		printAsci(a,b);
	}

	public static void printAsci(int a , int b) {
		int count = 1;
		for(int i = a; i < b; i++) {
			
			if(count % 10 == 0) {
				System.out.println((char)(i));	
			} else {
				System.out.print((char)(i) + " ");
			}
			
			count++;
		}
	}
}
