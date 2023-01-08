package chapter_03.exercise_24;

public class PickCard {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 13 + 1);
		System.out.print("Sectiginiz kart ");
		
		switch(x) {
		case 1: System.out.print("1");break;
		case 2: System.out.print("2");break;
		case 3: System.out.print("3");break;
		case 4: System.out.print("4");break;
		case 5: System.out.print("5");break;
		case 6: System.out.print("6");break;
		case 7: System.out.print("7");break;
		case 8: System.out.print("8");break;
		case 9: System.out.print("9");break;
		case 10: System.out.print("10");break;
		case 11: System.out.print("Vale");break;
		case 12: System.out.print("Kiz");break;
		case 13: System.out.print("Papaz");break;
		
		}
		
		int y = (int) (Math.random() * 3 + 1);
		
		switch(y) {
		case 1 : System.out.print(" Sinek");break;
		case 2 : System.out.print(" Karo");break;
		case 3 : System.out.print(" Kupa");break;
		case 4 : System.out.print(" Maca");break;
		
		
		}
		
		
		
	}
}
