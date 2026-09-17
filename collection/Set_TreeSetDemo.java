package collection;

import java.util.*;
//sorted order + navigation methods)
public class Set_TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        System.out.println("TreeSet (Sorted): " + set);

        // Navigation methods
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("HeadSet(<Mango): " + set.headSet("Mango"));
        System.out.println("TailSet(>=Mango): " + set.tailSet("Mango"));
        System.out.println("SubSet(Apple to Mango): " + set.subSet("Apple", "Mango"));
        System.out.println("Higher than Apple: " + set.higher("Apple"));
        System.out.println("Lower than Mango: " + set.lower("Mango"));
        System.out.println("Ceiling(Avocado): " + set.ceiling("Avocado"));
        System.out.println("Floor(Avocado): " + set.floor("Avocado"));
        System.out.println("DescendingSet: " + set.descendingSet());
    }
}

