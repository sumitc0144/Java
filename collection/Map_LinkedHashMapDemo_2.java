package collection;

import java.util.*;
import java.util.Map;

public class Map_LinkedHashMapDemo_2 {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "First");
        linkedHashMap.put(2, "Second");
        linkedHashMap.put(3, "Third");

        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Iteration preserves insertion order
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Entry: " + entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("Contains key 2? " + linkedHashMap.containsKey(2));
        System.out.println("Contains value 'Third'? " + linkedHashMap.containsValue("Third"));
        System.out.println("Size: " + linkedHashMap.size());
        System.out.println("Is empty? " + linkedHashMap.isEmpty());
    }
}
