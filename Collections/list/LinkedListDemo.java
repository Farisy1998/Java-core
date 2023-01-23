package list;

import java.util.LinkedList;
import java.util.List;

// Linked list will store the elements in the insertion order
public class LinkedListDemo {
    public static void main(String[] args) {
        List<Object> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20.5);
        linkedList.add("Hello");
        linkedList.add(true);
        
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(2));
    }
}
