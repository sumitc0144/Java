package collection;

import java.util.*;

public class Map_HashTableDemo_3 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("A", "Apple");
        hashtable.put("B", "Banana");

        System.out.println("Hashtable: " + hashtable);
        System.out.println("Contains key 'A'? " + hashtable.containsKey("A"));
        System.out.println("Contains value 'Banana'? " + hashtable.containsValue("Banana"));
        System.out.println("Keys: " + hashtable.keySet());
        System.out.println("Values: " + hashtable.values());

        hashtable.remove("A");
        System.out.println("After removal: " + hashtable);
    }
}
