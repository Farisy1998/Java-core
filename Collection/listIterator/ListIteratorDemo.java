package listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("abc");
        list.add("def");
        list.add("mno");
        list.add("xyz");

        ListIterator<String> itr = list.listIterator();

        // forward list traversing
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // backward list traversing
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
        System.out.println();
    }
}
