package chapter_10.exercise_10;


public class Queue {
	private int[] element;
	private int numberOfElements;
	private int capacity;

	private final int DEFAULT_CAPACİTY = 8;

	public Queue() {
		capacity = DEFAULT_CAPACİTY;
		element = new int[capacity];
	}

	public Queue(int capacitiy) {
		element = new int[capacity];
	}

	public void enqueue(int data) {
		if (numberOfElements >= element.length) {
			int[] temp = new int[2 * element.length];
			System.arraycopy(element, 0, temp, 0, element.length);
			element = temp;
		}

		element[numberOfElements++] = data;
	}

	public int dequeue(int data) {
		int index = -1;
		int dropData = -1;

		for (int i = 0; i < element.length; i++) {
			if (data == element[i]) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			throw new RuntimeException("Data is have not!");
		} else {
			dropData = element[index];
			for (int i = index; i < element.length - 1; i++) {
				element[i] = element[i + 1];
			}
		}
		numberOfElements--;
		
		return dropData;
	}

	public boolean empty() {
		return numberOfElements == 0;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public int[] getElement() {
		return element;
	}

}
