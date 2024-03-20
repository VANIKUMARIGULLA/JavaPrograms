package assignmentPrograms;

import java.util.*;


public class SplitOfList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		al.add("4");
		al.add("9");
		al.add("8");
		al.add("5");
		al.add("0");
		al.add("10");
		int totalSize = al.size();
		
		for(int i = 0; i < totalSize/2; i++) {
			list1.add(al.get(i));
		}
		for(int i = totalSize/2; i < totalSize; i++) {
			list2.add(al.get(i));
		}
		System.out.println("List1 - "+ list1 + "& list2 - "+list2);
	}
}