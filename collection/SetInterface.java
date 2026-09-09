package collection;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        // HashSet (unordered)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A"); // duplicate ignored
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet (insertion order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("X");
        linkedHashSet.add("Y");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet (sorted order)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println("TreeSet: " + treeSet);
    }
}

