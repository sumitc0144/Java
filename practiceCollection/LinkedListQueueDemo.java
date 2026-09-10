package practiceCollection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("First");   // adds element, throws exception if fails
        queue.offer("Apple"); // adds element, returns false if fails
        queue.add("Banana");

        System.out.println("Queue after add/offer: " + queue);

        // Remove head element (throws exception if empty)
        System.out.println("Remove (head element): " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // Poll head element (returns null if empty)
        System.out.println("Poll (head element): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Peek at head element (returns null if empty)
        System.out.println("Peek (head element): " + queue.peek());

        // Element (like peek, but throws exception if empty)
        System.out.println("Element (head element): " + queue.element());

        // Contains
        System.out.println("Contains 'Apple'? " + queue.contains("Apple"));

        // Size
        System.out.println("Size of queue: " + queue.size());

        // isEmpty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Iteration
        System.out.println("Iterating through queue:");
        for (String item : queue) {
            System.out.println(item);
        }

        // Clear
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}

