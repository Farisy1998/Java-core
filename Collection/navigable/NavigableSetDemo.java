package navigable;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set.floor(30)); // <=
        System.out.println(set.lower(30)); // <
        System.out.println(set.ceiling(40)); // >=
        System.out.println(set.higher(40)); // >
        System.out.println(set.pollFirst()); // removes and return 1st element
        System.out.println(set.pollLast()); // removes and return last element
        System.out.println(set.descendingSet()); // print set in descending order
        System.out.println(set);
    }
}
