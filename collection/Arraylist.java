package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name=new ArrayList<>();
		
		name.add("soma");
		name.add("pooja");
		name.add("Sumit");
		name.add("sum");
		for(String names:name) {
			System.out.println(names);
		}
		name.remove(3);
		System.out.println("The value is removed");

		name.set(0,"Sumit");
		
		System.out.println("The value is changed");

		for(String names:name) {
			System.out.println(names);
		}
		
		System.out.println(name.indexOf("Sumit"));
		
		System.out.println(name.lastIndexOf("Sumit"));
		
		name.addFirst("Soma");
		name.addLast("Sam");
		
		
		for(String names:name) {
			System.out.println(names);
		}
	}

}
