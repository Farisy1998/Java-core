package navigable;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Tom");
        map.put(2, "Aarathy");
        map.put(3, "Hari");
        map.put(4, "Raju");
        map.put(5, "Ramu");
        
        System.out.println(map);
        System.out.println(map.ceilingEntry(3)); // >=
        System.out.println(map.higherEntry(3)); // >
        System.out.println(map.floorEntry(2)); // <=
        System.out.println(map.lowerEntry(2)); // <
        System.out.println(map.pollFirstEntry()); // removes and return first entry
        System.out.println(map.pollLastEntry()); // removes and return last entry
        System.out.println(map.descendingMap()); // print the map in descending order
        System.out.println(map);
    }
}
