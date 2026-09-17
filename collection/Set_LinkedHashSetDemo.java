package collection;

import java.util.*;
//LinkedHashSet (insertion order preserved)
public class Set_LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate ignored

        System.out.println("LinkedHashSet: " + set);

        // Functions
        System.out.println("Contains 20? " + set.contains(20));
        set.remove(30);
        System.out.println("Size : " + set.size());
        System.out.println("After remove: " + set);
    }
}
