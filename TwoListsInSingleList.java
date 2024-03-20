package assignmentPrograms;

import java.util.Vector;

public class TwoListsInSingleList {

	public static void main(String[] args) {
		
		Vector <Integer> list1 = new Vector<>();
		list1.add(4);
		list1.add(9);
		list1.add(8);
		
		Vector<Integer> list2 = new Vector<>();
		list2.add(5);
		list2.add(0);
		list2.add(10);
		
		//System.out.println(list1);
		list1.addAll(list2);
		System.out.println(list1);
		
	}

}
