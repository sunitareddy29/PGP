package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		System.out.println(names.add("Sunil")); //true
		names.add("Anil");
		names.add("Rahul");
		names.add("Praveen");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names);

	}

}
