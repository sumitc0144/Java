package practiceCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create a Deque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements
        deque.add("Front");          // adds to tail (like addLast)
        deque.addLast("Back");       // explicitly adds to tail
        deque.addFirst("Start");     // adds to head
        deque.offer("OfferTail");    // adds to tail, returns false if fails
        deque.offerFirst("OfferHead"); // adds to head
        deque.offerLast("OfferEnd");   // adds to tail

        System.out.println("Deque after adds: " + deque);

        // Peek operations
        System.out.println("Peek First: " + deque.peekFirst()); // head
        System.out.println("Peek Last: " + deque.peekLast());   // tail

        // Poll operations (remove + return)
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println("Deque after polls: " + deque);

        // Remove operations
        System.out.println("Remove First: " + deque.removeFirst());
        System.out.println("Remove Last: " + deque.removeLast());
        System.out.println("Deque after removes: " + deque);

        // Contains
        System.out.println("Contains 'Back'? " + deque.contains("Back"));

        // Size and isEmpty
        System.out.println("Size: " + deque.size());
        System.out.println("Is Empty? " + deque.isEmpty());

        // Iteration
        System.out.println("Iterating through deque:");
        for (String item : deque) {
            System.out.println(item);
        }

        // Clear
        deque.clear();
        System.out.println("Deque after clear: " + deque);
    }
}
