package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10);
        Integer id3 = new Integer(10);

        // when using HashMap only one entry with id:10 will printed (ie, 
        // last entry with id:10). Becuz the HashMap uses equals() method 
        // to check whether the values are equal. But when using IdentityHashMap 
        // both entries with same id:10 will be printed and they are not 
        // ignored. Becus the IdentityHashMap deosn't uses equals() method.
        // Since the keys are different interger objects and it have the 
        // different refences to the memory (ie, different memory locations
        // holding the same value '10') and these objects where referenceing
        // to that defferent memeory locations.
        map.put(id1, "John");
        map.put(id2, "Arjun");
        map.put(id3, "Arun");

        System.out.println(map);
    }
}
