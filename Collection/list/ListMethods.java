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

		List<Integer> list2 = new ArrayList<>();
		list2.add(150);
		list2.add(200);
		list2.add(300);

		list.addAll(list2); // adding another list
		System.out.println("List: " + list);

		// check if list contains an item
		System.out.println(list.contains(100) ? "List has the value" : "List doesn't have the value");

		// return size of list
		System.out.println(list.size());

		// get an object from list
		System.out.println(list.get(2));
		System.out.println(list);

		// remove from an index
		list.remove(1);
		System.out.println(list);
	}

}
