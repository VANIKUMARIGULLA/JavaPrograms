package assignmentPrograms;

import java.util.*;

public class DeleteDuplicateNumbers {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		
		ArrayList<Integer> al = new ArrayList<>(list);
		
		list.add(4);
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(8);
		list.add(0);
		list.add(5);
		list.add(1);
		list.add(8);
		list.add(6);
		
		
		
		for(int i = 0; i <= list.size(); i++) {
			for(int j = 0; j <= list.size(); j++) {
				if(list.get(i) == list.get(j)) {
					System.out.println(list.get(i));
				}
			}
		
		}
	}

}
