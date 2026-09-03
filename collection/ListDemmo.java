package collection;

import java.util.ArrayList;
import java.util.List;


public class ListDemmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("Sumit");
		names.add("Chauhan");
		for(String name:names) {
			System.out.println(name);
		}
			List<Integer> age=new ArrayList<>();
			age.add(22);
			age.add(30);
			for(Integer Age:age) {
				System.out.println(Age);
			}
		}
	
}
