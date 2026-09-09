package collection;

import java.util.*;

// maintain insertion and uses indix based search
public class Listinterface {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple"); // duplicates allowed
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        System.out.println("LinkedList: " + linkedList);

        // Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        System.out.println("Vector: " + vector);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Stack pop: " + stack.pop());
    }
}

