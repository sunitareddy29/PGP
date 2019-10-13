package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) throws Exception{
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names.add("Sunil")); //true
		names.add("Anil");
		names.add("Rahul");
		names.add("Praveen");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name+" | ");
			Thread.sleep(1000);
		}
		System.out.println();
		
		names.add(null);
		System.out.println(names);
	}
}
