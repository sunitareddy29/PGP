package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Sunil")); //true
		names.add("Anil");
		names.add("Rahul");
		names.add("Praveen");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names);
		System.out.println("headSet() = "+names.headSet("Praveen"));
		System.out.println("tailSet() = "+names.tailSet("Praveen"));
		System.out.println(names.descendingSet());
		
		System.out.println();
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);		
	}
}
