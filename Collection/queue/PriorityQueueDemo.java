package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        System.out.println(q);
        System.out.println(q.peek());

        for (int i = 21; i <= 30; i++) {
            q.offer(i); // add an element to queue
        }
        // Queue will kept the elements in sorted order for first time.
        // And id an element is removed from the queue, the sorting
        // order will destroy. If we want to keep the order, the we
        // want to use the Tree collection.
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
