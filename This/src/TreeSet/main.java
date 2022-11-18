package TreeSet;

import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> num = new TreeSet<>();
		num.add(54);
		num.add(56);
		num.add(45);
		num.add(65);
		num.add(99);
		for(Integer n:num) {
			System.out.println(n);
		}

	}

}
