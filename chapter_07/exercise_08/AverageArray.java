package chapter_07.exercise_08;

public class AverageArray {
	public static void main(String[] args) {
		double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 2, 3};
		 int a = (int)average(array);
		 double b = average(array);
		 
		 System.out.println(a);
		 System.out.println(b);
	}

	private static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
	return sum / array.length;
	}
	

	private static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
	return sum / array.length;
	}
}
