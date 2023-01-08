package chapter_04.exercise_23;

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Calisanın adini giriniz:");
		String name = input.next();
		System.out.println("Haftalik calisma saatini giriniz:");
		double week = input.nextDouble();
		System.out.println("Saat ucretini giriniz:");
		double hourPrice = input.nextDouble();
		System.out.println("Gelir vergisi oranini giriniz: ");
		double tax = input.nextDouble();
		System.out.println("Stopaj vergisi oranini giriniz:");
		double stoppage = input.nextDouble();
		
		double gross = week * hourPrice;
		double incomeTax = gross * tax;
		double stoppageTax = gross * stoppage;
		double totalTax = incomeTax + stoppageTax;
		double net = gross - totalTax;
		
	System.out.println("\n");
	
	
		System.out.println("Calisan adi:" + name + "\n"
				         + "Haftalik Calisma Saati:" + week + "\n"
						 + "Saat Ucreti:$" + hourPrice + "\n"
						 + "Brut Ucret :$" + gross + "\n"
						 + "İndirimler :\n"
						 + "     Gelir Vergisi:$" + incomeTax + "\n"
						 + "    Stopaj Vergisi:$" + stoppageTax + "\n"
						 + "    Toplam İndirim:$" + totalTax + "\n"
						 + "Net Ucret:$" + net);
	
	}
}
