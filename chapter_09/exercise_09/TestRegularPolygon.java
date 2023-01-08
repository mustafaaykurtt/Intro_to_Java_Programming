package chapter_09.exercise_09;

public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon regular1 = new RegularPolygon();
		RegularPolygon regular2 = new RegularPolygon(6, 4);
		RegularPolygon regular3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Cevre 1: " + regular1.getPerimeter());
		System.out.println("Cevre 2: " + regular2.getPerimeter());
		System.out.println("Cevre 3: " + regular3.getPerimeter() + "\n");
		
		System.out.printf("Alan 1: %.3f\n", regular1.getArea());
		System.out.printf("Alan 2: %.3f\n", regular2.getArea());
		System.out.printf("Alan 3: %.3f\n", regular3.getArea());
	}
}
