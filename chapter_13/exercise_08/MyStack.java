package chapter_13.exercise_08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
	private ArrayList<Integer> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Integer peek() {
		return list.get(list.size() - 1);
	}

	public Integer pop() {
		Integer number = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return number;
	}

	public void push(Integer number) {
		list.add(number);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		MyStack myStackClone = (MyStack)super.clone();				//Shallow copy..
		
		for (int i = 0; i < list.size(); i++) {
			myStackClone.list = deepCopy(list);							//deep copy
		}
		return myStackClone;
	}
	
	private static ArrayList<Integer> deepCopy(ArrayList<Integer> list2) {
		ArrayList<Integer> newList = new ArrayList<>(list2.size());
		for (int i = 0; i < list2.size(); i++) {
			newList.add(list2.get(i));
		}
		return newList;
	}

	public String toString() {
		return list.toString();
	}
}


