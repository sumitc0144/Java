package collection;

import java.util.*;

public class Listinterface {
    public static void main(String[] args) {
        // =========================
        // ArrayList
        // =========================
        List<String> arrayList = new ArrayList<>();
        
        // ADD
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple"); // duplicates allowed
        System.out.println("ArrayList: " + arrayList);

        // GET (index-based access)
        System.out.println("Element at index 1: " + arrayList.get(1));

        // SET (replace element)
        arrayList.set(0, "Mango");
        System.out.println("After set: " + arrayList);

        // REMOVE (by index or value)
        arrayList.remove(1); // removes "Banana"
        System.out.println("After remove: " + arrayList);
        
        //Size
        System.out.println("Size: "+arrayList.size());

//        //Capcity
//        System.out.println("Size: "+arrayList.());

        //isEmpty
        System.out.println("isEmpty: "+arrayList.isEmpty());
        
        //lastIndexOf
        System.out.println("lastIndexOf: "+arrayList.lastIndexOf("Apple"));
        
        
        // SEARCH
        System.out.println("Index of 'Apple': " + arrayList.indexOf("Apple"));
        System.out.println("Contains 'Mango'? " + arrayList.contains("Mango"));

        
        //Using for Loop
        System.out.println("Using for loop");
        
        for (int i = 0; i < arrayList.size(); i++)
        {
        	System.out.println(arrayList.get(i)); 
        	} 
        
        
        
        // ITERATE Enhanced Loop
        

        System.out.println("Using Enhanvced for loop");
        for (String fruit : arrayList) {
            System.out.println("Fruit: " + fruit);
        }
        
        
        
        //Using forEach

        System.out.println("Using forEach loop");
        
        arrayList.forEach(name -> System.out.println(name)); 
        
        
        //clear
        
//        System.out.println(arrayList.clear())
        
        System.out.println();
        System.out.println();

        // =========================
        // LinkedList
        // =========================
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        System.out.println("LinkedList: " + linkedList);

        // Add at specific position
        linkedList.add(1, "Inserted");
        System.out.println("After insertion: " + linkedList);

        // Remove first element
        //type casting is done 
        //List is used but removeFirst() is for LinkedList 
        
        ((LinkedList<String>) linkedList).removeFirst();
        System.out.println("After removeFirst: " + linkedList);

        // =========================
        // Vector
        // =========================
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);

        // Access by index GET
        System.out.println("Vector element at 1: " + vector.get(1));
        
     // SET element at index
        vector.set(0, 9);
        System.out.println("After set: " + vector);

        // Remove element
        vector.remove(0);
        System.out.println("After remove: " + vector);
        
        System.out.println("Size: " + vector.size());

        System.out.println();
        System.out.println();
        
        
        // =========================
        // Stack
        // =========================
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Stack: " + stack);

        // POP (remove top)
        System.out.println("Pop: " + stack.pop());

        // PEEK (see top without removing)
        System.out.println("Peek: " + stack.peek());

        // SEARCH (returns 1-based position from top)
        System.out.println("Search 'First': " + stack.search("First"));

        // Check empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
