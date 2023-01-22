package list;

import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		// Integer type array list
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(new Integer(10));
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(int number: list)
			System.out.println(number);
	}

}
