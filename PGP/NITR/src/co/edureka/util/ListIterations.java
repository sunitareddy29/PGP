package co.edureka.util;

import java.util.*;

public class ListIterations 
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=11;i<=16;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		iterate1(list);
		seperator();
		
		iterate2(list);
		seperator();
		
		iterate3(list);
		seperator();
		
		iterate4(list);
		seperator();
		
		iterate5(list);
	}
	
	static void iterate1(List<Integer> list) {
		System.out.println("1) using a normal for loop and get()- only for java.util.List");
		for(int i=0;i<list.size();i++) {
			Integer n = list.get(i);
			System.out.print(n+"   ");
		}
	}
	
	static void iterate2(List<Integer> list) {
		System.out.println("2) using enhanced for loop");
		for(Integer n : list) {			
			System.out.print(n+"   ");
		}
	}
	
	static void iterate3(List<Integer> al) {
		System.out.println("3) using java.util.Iterator");
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
	}

	static void iterate4(List<Integer> al) {
		System.out.println("4) using java.util.ListIterator -  only for java.util.List");
		ListIterator<Integer> lit = al.listIterator();		
		while(lit.hasNext()) {
			Integer n = lit.next();
			System.out.print(n+"   ");
		}
		seperator();
		
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n+"   ");
		}
	}

	static void iterate5(List<Integer> al) {
		System.out.println("5) using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(al);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
	}	
	
	static void seperator() {
		System.out.println("\n");
		try {
		 Thread.sleep(1500);
		}
		catch(Exception ex) {}
	}
	
	
}
