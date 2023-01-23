package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Treeset sort the elments in ascending order
        Set<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);

        System.out.println(set);
    }
}
