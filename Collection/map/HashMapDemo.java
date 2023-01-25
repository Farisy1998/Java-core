package map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // hashMap store elements in random order nad it ingore the
        // entries with same keys and only kept one entry among them
        Map<String, Integer> map = new HashMap<>();

        map.put("Joy", 70);
        map.put("Tom", 60);
        map.put("Lee", 99);
        map.put("Brad", 80);

        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();

        for (String key : keys)
            System.out.println(key + ": " + map.get(key));

    }
}
