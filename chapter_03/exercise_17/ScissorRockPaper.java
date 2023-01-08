package chapter_03.exercise_17;

import java.util.Scanner;

public class ScissorRockPaper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("makas(0) , tas(1) , kagit(2):");
		int player = input.nextInt();
		int computer = (int) (Math.random() * 3);
		
		if (computer == 0 && player == 1) {
			System.out.println("Bilgisayar makas dedi.Siz kazandınız.");
		}else if (computer == 1 && player == 2) {
			System.out.println("Bilgisayar tas dedi.Siz kazandınız.");
		}else if (computer == 2 && player == 0) {
			System.out.println("Bilgisayar kagit dedi.Siz kazandınız.");
		
		}else if(computer == 1 && player == 0) {
			System.out.println("Bilgisayar tas dedi.Siz kaybettiniz");
		}else if(computer == 2 && player == 1) {
			System.out.println("Bilgisayar kagit dedi.Siz kaybettiniz");
		}else if(computer == 0 && player == 2) {
			System.out.println("Bilgisayar makas dedi.Siz kaybettiniz");
		}else {
			System.out.println("Lutfen gecerli bir sayi giriniz.");
		}
	}
}
