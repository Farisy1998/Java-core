package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // Java iterator is an interface (java.util.Iterator) that contains
        // different methods to iterator over collections

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> itr = list.iterator();

        // accessing list items
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            itr.remove(); // removing list element
        }
        System.out.println();
      
        System.out.println(list);
    }
}
