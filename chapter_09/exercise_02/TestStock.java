package chapter_09.exercise_02;

public class TestStock {
	public static void main(String[] args) {
		Stock stock = new Stock("ORM" , "Oracle Corporation" , 47 , 10);
		
		System.out.println("Symbol: " + stock.symbol);
		System.out.println("Name: " + stock.name);
		System.out.printf("Change percent: %.2f" , stock.getChangePercent());
	}
}
