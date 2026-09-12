package collection;

import java.util.Map;
import java.util.HashMap;


public class MAP {

	public static void main(String[] args) {
		
		Map<Integer,String> student=new HashMap<>(); 
		//HashMap<Integer,String> student=new HashMap<>(); 	
		
		//Add ->map.put('key','value')
		student.put(100, "Sumit");
		student.put(101, "Pooja");
		student.put(102, "Soma");
		student.put(102, "Soma1");
		student.put(103, "Karl");
		student.put(104, "Soma1");
		//If we add a value with the same key it will take the newly added value
		//but if key are different and value are same then it will store the value
		System.out.println("HashMap: "+student);
		
		//get(key based)
		System.out.println("Key Based: "+student.get(100));
		
		//containsKey(return true(if present) or false)
		System.out.println("Key Based Search: "+student.containsKey(100));
		
		//containsValue(return true(if present) or false)
		System.out.println("Value Based Search: "+student.containsValue("sumit"));
		
		//remove:(key based)
		System.out.println("Key Based Remove: "+student.remove(104));

		System.out.println("HashMap After remove: "+student);
		//remove:(key-value based)

		System.out.println("Key-value Based remove : "+student.remove(103,"Karl"));
		System.out.println("HashMap after remove key-value: "+student);
		
	// retrive key 

		System.out.println("HashMap Iterate->keySet: "+student.keySet());
	//retrive Value

		System.out.println("HashMap Iterate-.values: "+student.values());
		//retrive key-alue

		System.out.println("HashMap Iterate-key-values: "+student.entrySet());
		
	//Using for Loop
		for(Integer key:student.keySet()) {
				System.out.println("HashMap key: "+key);
		}
	// can do for values and entrySet too.
		System.out.println("For loop for (entrySet)->key-value");
		for(Map.Entry<Integer,String> entry:student.entrySet()) {
			System.out.println("HashMap key: "+entry.getKey());

			System.out.println("HashMap value: "+entry.getValue());
	}
	}

}
