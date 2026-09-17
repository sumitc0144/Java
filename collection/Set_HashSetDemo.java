package collection;

import java.util.*;
//Stores elements in an unordered manner.
public class Set_HashSetDemo {
	    public static void main(String[] args) {
	        Set<String> set = new HashSet<>();

	        // Basic operations
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Apple"); // duplicate ignored
	        System.out.println("HashSet: " + set);

	        // Common functions
	        System.out.println("Contains Banana? " + set.contains("Banana"));
	        set.remove("Orange");
	        System.out.println("After remove: " + set);
	        System.out.println("Size: " + set.size());
	        System.out.println("Is Empty? " + set.isEmpty());

	        // Bulk operations
	        Set<String> other = new HashSet<>(Arrays.asList("Banana", "Grapes"));
	        set.addAll(other);
	        System.out.println("After addAll: " + set);
	        set.retainAll(Arrays.asList("Banana", "Apple"));
	        System.out.println("After retainAll: " + set);
	        set.removeAll(Arrays.asList("Banana"));
	        System.out.println("After removeAll: " + set);

	        // Convert to array
	        Object[] arr = set.toArray();
	        System.out.println("Array: " + Arrays.toString(arr));

	        // Clear
	        set.clear();
	        System.out.println("After clear: " + set);
	    }
	}


