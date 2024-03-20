package assignmentPrograms;

import java.util.Vector;

public class DeleteElements {

	public static void main(String[] args) {
		
		Vector<Integer> list1 = new Vector<>();
		list1.add(4);
		list1.add(9);
		list1.add(8);
		
		Vector<Integer> list2 = new Vector<>();
		list2.add(4);
		list2.add(1);
		list2.add(9);
		list2.add(4);
		list2.add(8);
		list2.add(0);
		list2.add(5);
		list2.add(1);
		list2.add(8);
		list2.add(6);
		
		list2.removeAll(list1);
		System.out.println(list2);
		
		
	}

}
