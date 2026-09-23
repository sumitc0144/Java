package LambdaExpression;

import java.util.HashMap;
import java.util.Map;

public class Map_Foreach {
	public static void main(String[] args) {
		  Map<Integer, String> hashMap = new HashMap<>();
	        hashMap.put(1, "One");
	        hashMap.put(2, "Two");
	        hashMap.put(3, "Three");
	        System.out.println("USing forEach");
	        hashMap.forEach((id,num)->System.out.println(id+num));

	        System.out.println("USing for");
	        
	        for(Map.Entry<Integer, String> entry:hashMap.entrySet()) {

	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	}
}
