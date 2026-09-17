package collection;

import java.util.*;

public class PriorityQueueDemo_1 {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Insert elements
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);

        System.out.println("PriorityQueue: " + priorityQueue);

        // Functions
        System.out.println("Peek (head element): " + priorityQueue.peek());
        System.out.println("Poll (remove head): " + priorityQueue.poll());
        System.out.println("After poll: " + priorityQueue);
        System.out.println("Contains 3? " + priorityQueue.contains(3));
        System.out.println("Size: " + priorityQueue.size());
        System.out.println("Is empty? " + priorityQueue.isEmpty());
    }
}
