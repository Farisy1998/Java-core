package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 10; i <= 100; i += 10)
			list.add(i);

		System.out.println("List: " + list);

		list.set(0, 5); // replace
		System.out.println("List: " + list);

		list.add(1, 10); // add
		System.out.println("List: " + list);

	}

}
