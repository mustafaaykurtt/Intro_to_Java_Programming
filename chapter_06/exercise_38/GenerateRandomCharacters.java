package chapter_06.exercise_38;

public class GenerateRandomCharacters {
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 11 == 0) {
				System.out.print(findRandomCharacter('A', 'Z') + " ");
				System.out.println(findRandomCharacter('0', '9'));
			} else {
				System.out.print(findRandomCharacter('A', 'Z') + " ");
				System.out.print(findRandomCharacter('0', '9') + " ");
			}
		}
	}

	public static char findRandomCharacter(char ch1, char ch2) {
		return (char) (Math.random() * (ch2 - ch1 + 1) + ch1);
	}
}
