package practiceCollection;


import java.util.*;

public class QueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a PriorityQueue of integers
        Queue<Integer> pq = new PriorityQueue<>();

        // Adding elements (add / offer)
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.offer(7); // offer is similar to add

        System.out.println("Initial PriorityQueue: " + pq);

        // Peek: view the head (smallest element) without removing
        System.out.println("Peek (head element): " + pq.peek());

        // Poll: remove and return the head (smallest element)
        System.out.println("Poll (removed head): " + pq.poll());
        System.out.println("After poll: " + pq);

        // Remove: remove a specific element
        pq.remove(3);
        System.out.println("After removing 3: " + pq);

        // Contains: check if an element exists
        System.out.println("Contains 7? " + pq.contains(7));

        // Size: number of elements
        System.out.println("Size: " + pq.size());

        // isEmpty: check if queue is empty
        System.out.println("Is empty? " + pq.isEmpty());

        // Iterating through the queue
        System.out.println("Iterating elements:");
        for (Integer num : pq) {
            System.out.println(num);
        }

        // Clearing the queue
        pq.clear();
        System.out.println("After clear: " + pq);

	}

}
