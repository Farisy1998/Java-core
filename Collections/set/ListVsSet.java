package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args) {
        // Unlike list, set doesn't allows duplicate values
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // inserting elements into list
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(5);
            list.add(number);
        }
        System.out.println(list);

        // inserting elements into set
        for (int i = 0; i < 10; i++) {
            set.add(list.get(i));
        }
        
        System.out.println(set);
    }
}
