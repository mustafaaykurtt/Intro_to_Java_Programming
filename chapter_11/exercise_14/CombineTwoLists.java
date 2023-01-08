package chapter_11.exercise_14;

import java.util.ArrayList;

public class CombineTwoLists {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		fill(list1);
		fill(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		
		ArrayList<Integer> list3 = union(list1, list2);
		System.out.println(list3);
		
		
	}

	private static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = list1;
		for (int i = 0; i < list2.size(); i++) {
			list3.add(list2.get(i));
		}
		return list3;
	}

	private static void fill(ArrayList<Integer> list1) {
		for (int i = 0; i < 5; i++) {
			list1.add(i);
		}
	}
}
