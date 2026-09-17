package collection;

import java.util.*;

public class Map_TreeMapDemo_4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println("TreeMap (sorted): " + treeMap);

        // Extra navigation functions
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        System.out.println("HeadMap(2): " + treeMap.headMap(2));
        System.out.println("TailMap(2): " + treeMap.tailMap(2));
        System.out.println("SubMap(1 to 3): " + treeMap.subMap(1, 3));
        System.out.println("HigherKey(2): " + treeMap.higherKey(2));
        System.out.println("LowerKey(2): " + treeMap.lowerKey(2));
    }
}
