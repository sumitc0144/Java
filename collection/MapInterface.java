package collection;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap (insertion order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "First");
        linkedHashMap.put(2, "Second");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap (sorted by keys)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);

        // Hashtable
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("A", "Apple");
        hashtable.put("B", "Banana");
        System.out.println("Hashtable: " + hashtable);

        // Properties
        Properties props = new Properties();
        props.setProperty("username", "admin");
        props.setProperty("password", "1234");
        System.out.println("Properties: " + props);
    }
}

