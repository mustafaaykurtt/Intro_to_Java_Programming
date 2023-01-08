package chapter_03.exercise_04;

public class RandomMonth {
	public static void main(String[] args) {
		int Month = (int)(Math.random() * 12 + 1);
		
		System.out.println(Month);
		
		switch(Month) {
		case 1: System.out.println("ocak");break;
		case 2: System.out.println("subat");break;
		case 3: System.out.println("mart");break;
		case 4: System.out.println("nisan");break;
		case 5: System.out.println("mayis");break;
		case 6: System.out.println("haziran");break;
		case 7: System.out.println("temmuz");break;
		case 8: System.out.println("agustos");break;
		case 9: System.out.println("eylul");break;
		case 10: System.out.println("ekim");break;
		case 11: System.out.println("kasim");break;
		case 12: System.out.println("aralik");break;
			
		}
	}
}
