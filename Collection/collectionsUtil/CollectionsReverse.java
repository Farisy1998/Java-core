package collectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(8);
        list.add(70);
        list.add(50);
        list.add(40);

        System.out.println("Before reversing: " + list);

        Collections.reverse(list);
        System.out.println("After reversing: " + list);
    }
}
