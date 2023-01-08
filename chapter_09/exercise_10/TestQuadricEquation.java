package chapter_09.exercise_10;

public class TestQuadricEquation {
	public static void main(String[] args) {
		QuadricEquation quadricEquation =  new QuadricEquation(1, 2, 3);
		
		if(quadricEquation.getdicriminant() > 0) {
			System.out.printf("Roof 1: %.2f Roof 2: %.2f" ,quadricEquation.getRoot1(), quadricEquation.getRoot2() );
		} else if(quadricEquation.getdicriminant() == 0) {
			System.out.printf("Roof 1: %.2f " ,quadricEquation.getRoot1());
		} else {
			System.out.println("There is no root!");
		}
	}
}
