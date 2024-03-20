package assignmentPrograms;

import java.util.Vector;

public class EvenNumberSum {

	public static void main(String[] args) {

		Vector<Integer> es = new Vector<>();
		long sum = 0;
		es.add(4);
		es.add(5);
		es.add(0);
		es.add(9);
		es.add(8);
		es.add(10);
		
		for(int val: es) {
			if(val % 2 == 0) {
				sum += val;
				val++;
			}
		}
		System.out.println("Even Numbers Sum :"+ sum);

	}

}
