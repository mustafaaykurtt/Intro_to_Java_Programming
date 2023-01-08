package chapter_10.exercise_05;

public class PrimeNumbers {
	private int value;
	
	public PrimeNumbers() {
		
	}
	
	public PrimeNumbers(int value) {
		this.value = value;
	}
	
	public String primeFactor(int value) {
		StringBuilder primeFactor = new StringBuilder();
		
		int divide = 2;
		while(value / divide != 1) {
			
			if(value % divide == 0) {
				primeFactor.append(divide + ",");
				value /= divide;
			} else {
				divide++;
			}
		}
		primeFactor.append(value).reverse();
		return primeFactor.toString();
	}
}
