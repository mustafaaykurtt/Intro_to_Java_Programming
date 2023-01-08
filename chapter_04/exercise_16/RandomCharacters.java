package chapter_04.exercise_16;

public class RandomCharacters {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 26 + 65);
		
		
		char ch = (char)i;
		System.out.println(ch);
	}
}
