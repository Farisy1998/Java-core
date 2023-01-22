package list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// object types list
		ArrayList list = new ArrayList<>();
		
		list.add(new Integer(10));
		list.add(20);
		list.add(30.45);
		list.add("Hello");
		
		for(Object obj: list)
			System.out.println(obj);
		
	}

}
