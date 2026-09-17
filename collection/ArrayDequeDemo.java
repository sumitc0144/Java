package collection;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Insert elements
        deque.add("Front");       // same as addLast
        deque.addLast("Back");
        deque.addFirst("NewFront");

        System.out.println("ArrayDeque: " + deque);

        // Functions
        System.out.println("PeekFirst: " + deque.peekFirst());
        System.out.println("PeekLast: " + deque.peekLast());
        System.out.println("PollFirst: " + deque.pollFirst());
        System.out.println("PollLast: " + deque.pollLast());
        System.out.println("After polls: " + deque);

        deque.offerFirst("OfferFront");
        deque.offerLast("OfferBack");
        System.out.println("After offers: " + deque);

        System.out.println("Contains 'Back'? " + deque.contains("Back"));
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());
    }
}
