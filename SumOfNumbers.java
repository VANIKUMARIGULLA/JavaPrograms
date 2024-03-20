package assignmentPrograms;

import java.util.Vector;

public class SumOfNumbers {

	public static void main(String[] args) {

		Vector<Integer> s = new Vector<>();
		long sum = 0;
		s.add(4);
		s.add(5);
		s.add(0);
		s.add(9);
		s.add(8);
		s.add(10);
		int totalElements = s.size();
	
		for(int val: s) {
			sum += val;
			val++;
		}
		
		System.out.println(sum);
		long avg = sum/totalElements;
		System.out.println(avg);
	}

}
