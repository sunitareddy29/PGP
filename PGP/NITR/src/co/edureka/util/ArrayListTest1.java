package co.edureka.util;

import java.util.ArrayList;

public class ArrayListTest1 
{
	public static void main(String[] args) 
	{
	  ArrayList<String> names = new ArrayList<String>();	
	  System.out.println(names+ " | Size = "+ names.size());
	  
	  names.add("Anil");
	  names.add("Sunil");
	  names.add("Praveen");
	  names.add("Sanjay");
	  names.add("Naveen");
	  names.add("Sunil");
	  System.out.println(names+ " | Size = "+ names.size());
	  
	  names.add(1,"edureka");
	  System.out.println(names+ " | Size = "+ names.size());
	  
	  names.set(0, "Java");
	  System.out.println(names+ " | Size = "+ names.size());
	  
	  System.out.println("Person @ index 0 = "+ names.get(0));
	  
	  System.out.println("Index of Sunil = "+ names.indexOf("Sunil"));
	  System.out.println("Last Index of Sunil = "+ names.lastIndexOf("Sunil"));
	  System.out.println("Index of sunil = "+ names.indexOf("sunil")); //-1
	  
	  System.out.println("remove(object) = "+ names.remove("Sunil"));
	  System.out.println("remove(index) = "+ names.remove(0));
	  
	  System.out.println(names+ " | Size = "+ names.size());
	}
}
