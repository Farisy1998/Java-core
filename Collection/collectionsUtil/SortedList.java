package collectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("X");
        list.add("B");
        list.add("A");
        list.add("Z");
        list.add("P");

        System.out.println("Before sorting: " + list);

        Collections.sort(list);
        // Collections.sort(list, new ArrayListComparator());
        System.out.println("After sortng: " + list);

        // Binary search
        int index = Collections.binarySearch(list, "X");
        System.out.println("Found at index: " + index);
    }
}
