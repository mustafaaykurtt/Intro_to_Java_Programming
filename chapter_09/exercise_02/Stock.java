package chapter_09.exercise_02;

public class Stock {
	public String symbol;
	public String name;
	private double previousClasingPrice;
	private double currentPrice;
	
	public Stock() {
		this(null , null , 0 , 0);
	}
	
	public Stock(String symbol , String name , double previousClasingPrice , double currentPrice) {
		this.symbol = symbol;
		this.name = name;
		this.previousClasingPrice = previousClasingPrice;
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent() {
		return ((currentPrice - previousClasingPrice) * 100 ) / previousClasingPrice;
	}
}
