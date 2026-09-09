package collection;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque; 
import java.util.ArrayDeque; 


public class Queueinterface {
    public static void main(String[] args) {
        // PriorityQueue
    	Queue<Integer> priorityQueue = new PriorityQueue<>();
    	priorityQueue.add(5);
    	priorityQueue.add(1);
    	priorityQueue.add(3);
    	System.out.println("PriorityQueue: " + priorityQueue);


        // LinkedList as Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue poll: " + queue);

        // ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Front");
        deque.addLast("Back");
        System.out.println("Deque: " + deque);
    }
}
