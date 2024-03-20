package assignmentPrograms;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		
		for(int i = 2; i <= 50; i++) {
			int flag = 0;
			for(int j = 2; j < i; j++) {
				if(list.get(i)%list.get(j) == 0) {
					flag += 1;
					break;
					
				}
			}
		if(flag == 0) {
			System.out.println(list.get(i));
		}
		}
	}

}
