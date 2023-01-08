package chapter_07.exercise_02;

public class ReverseNumbersEntered {
	public static void main(String[] args) {
		int[] array = new int [10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		print(array);
		reverse2(array);
	}

	public static void print(int[] array) {	
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] reverse(int[] dizi) { 
		int[] reverse = new int[dizi.length];
		for (int i = 0 , j = dizi.length -1; i < dizi.length ; i++ , j--) {
			reverse[i] = dizi[j];
		}
	return reverse;
	}
	
	public static void reverse2(int[] array) {
		for (int i = array.length - 1; i > -1; i--) {
			System.out.print(array[i] + " " );
		}
	}
}
