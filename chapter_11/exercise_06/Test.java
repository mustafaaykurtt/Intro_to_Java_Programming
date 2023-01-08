package chapter_11.exercise_06;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<>();
		
		obj.add(new Loan());
		obj.add(new Date());
		obj.add(new String("String"));
		obj.add(new Circle());
		
		for (int i = 0; i < obj.size(); i++) {
			System.out.println((obj.get(i)).toString());
		}
		
		
 	}
}
