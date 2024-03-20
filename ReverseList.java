package assignmentPrograms;

import java.util.Vector;

public class ReverseList {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		list.add(1);
		list.add(8);
		list.add(0);
		list.add(5);
		list.add(1);
		list.add(6);
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		

	}

}
