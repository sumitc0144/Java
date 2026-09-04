package collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(10);
        num.add(22);
        num.add(30);
        num.add(34);
        num.add(58);
        num.add(1);

        // Convert to List
        List<Integer> sortedList = new ArrayList<>(num);

        // Sort the List
        Collections.sort(sortedList);

        System.out.println("Sorted numbers: " + sortedList);
    }
}
