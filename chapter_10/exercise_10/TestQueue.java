package chapter_10.exercise_10;


public class TestQueue {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		for (int i = 0; i < 25; i++) {
			queue.enqueue(i);
		}
		
		int[] a = queue.getElement();
		for (int i = 0; i < queue.getNumberOfElements(); i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; !queue.empty(); i++) {
			queue.dequeue(i);
		}
		System.out.println(queue.getNumberOfElements());
	}
}
