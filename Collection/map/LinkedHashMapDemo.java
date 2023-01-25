package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // LinkedHashMap store elements in inserting order
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Joy", 70);
        map.put("Tom", 60);
        map.put("Lee", 99);
        map.put("Brad", 80);

        Set<String> keys = map.keySet();

        for (String key : keys)
            System.out.println(key + ": " + map.get(key));
    }
}
