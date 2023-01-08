package chapter_04.exercise_26;

import java.util.Scanner;

public class MonertaryUnits {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Lütfen parayı giriniz: ");
			String para = input.next();
			
			String toplamTl = para.substring(0 , para.indexOf('.'));
		
			int toplamKurus = Integer.parseInt(para.substring(para.indexOf('.') + 1));
			
			
			int elliKurus = (toplamKurus % 100) / 50;
			
			int yirmiBesKurus = (toplamKurus % 50) / 25;
			
			int onKurus = (toplamKurus % 25) / 10;
			
			int birKurus = (toplamKurus % 5) / 1;
			
			System.out.println(toplamTl + " :tane 1 Tl'n var. ");
			System.out.println(elliKurus + " :tane 50 Kuruşun var.");
			System.out.println(yirmiBesKurus + " :tane 25 Kuruşun var.");
			System.out.println(onKurus + " :tane 10 kuruşun var");
			System.out.println(birKurus + " :tane 1 kurusun var.");
			
	}

}
