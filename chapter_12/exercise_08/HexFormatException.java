package chapter_12.exercise_08;

public class HexFormatException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String hex;
	
	public HexFormatException(String hex) {
		super(hex);
		this.hex = hex;
	}
	
	public String getHex() {
		return hex;
	}
}
