package collection;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque; 
import java.util.ArrayDeque; 

//Collection 
//+--- Queue 
//+--- LinkedList 
//+--- PriorityQueue
//+--- ArrayDeque 
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
        queue.offer("Apple");//adds element but offer is queue specific insertionmetthod
        System.out.println("Queue : " + queue);
        // System.out.println("Queue Remove: " + queue.remove());
        System.out.println("Queue poll(RemovesFirst Element like .remove()): " + queue.poll());
        System.out.println("To peek first elemnet in Queue use element() or peek both work:  "+queue.element());
        //size(),isEmpty(),contains() work same
        
        // ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Front");
        deque.addLast("Back");
        System.out.println("Deque: " + deque);
    }
}
