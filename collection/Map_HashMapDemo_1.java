package collection;

import java.util.*;

public class Map_HashMapDemo_1{
    public static void main(String[] args) {
        // 1. HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(null, "NullKey"); // allowed
        hashMap.put(3, null);         // null value allowed
        System.out.println("HashMap: " + hashMap);

        // Common functions
        System.out.println("Get key 2: " + hashMap.get(2));
        System.out.println("Contains key 3? " + hashMap.containsKey(3));
        System.out.println("Contains value 'Two'? " + hashMap.containsValue("Two"));
        System.out.println("Size: " + hashMap.size());
        System.out.println("Is empty? " + hashMap.isEmpty());
        System.out.println("KeySet: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
        System.out.println("EntrySet: " + hashMap.entrySet());
        hashMap.remove(1);
        System.out.println("After removal: " + hashMap);
        hashMap.clear();
        System.out.println("After clear: " + hashMap);


    }
}
