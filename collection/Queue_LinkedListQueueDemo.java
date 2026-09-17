package collection;

import java.util.*;

public class Queue_LinkedListQueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Insert elements
        queue.add("First");
        queue.offer("Second"); // offer is queue-specific
        queue.add("Third");

        System.out.println("LinkedList Queue: " + queue);

        // Functions
        System.out.println("Peek: " + queue.peek());
        System.out.println("Element: " + queue.element()); // throws exception if empty
        System.out.println("Poll (remove head): " + queue.poll());
        System.out.println("Remove (remove head): " + queue.remove());// throws exception if empty
        System.out.println("After removals: " + queue);
        System.out.println("Contains 'Second'? " + queue.contains("Second"));
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty? " + queue.isEmpty());
    }
}
