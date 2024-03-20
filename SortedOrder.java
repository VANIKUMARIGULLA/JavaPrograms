package assignmentPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SortedOrder {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		
		list.add(4);
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(8);
		list.add(0);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(8);
		list.add(6);
		
		Collections.sort(list);
		System.out.println(list);
		
		Comparator comparator = Collections.reverseOrder();
		//System.out.println(list);
		
		Collections.sort(list, comparator);
		System.out.println(list);
		
	}

}
