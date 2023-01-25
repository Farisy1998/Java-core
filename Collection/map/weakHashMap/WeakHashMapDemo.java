package map.weakHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // When using HashMap the garbage collector will not call even there
        // are weak objects referenced by the HashMap. Means the regular 
        // HashMap is stronger than the WeakHashMap.
        // Map<User, String> map = new HashMap<>();

        // while using WeakHashMap the grbage colllector will be called
        // and all the weak objects or unreferenced objects used by the
        // WeakHashMap are cleared. Since this is a weak hashmap.
        Map<User, String> map = new WeakHashMap<>();

        User u = new User();
        map.put(u, "Tom");

        System.out.println(map);

        u = null;
        System.gc();
        Thread.sleep(3000);

        System.out.println(map);
    }
}
