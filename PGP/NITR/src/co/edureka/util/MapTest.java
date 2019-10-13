package co.edureka.util;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		bank.put("Sunil",25000.5f);
		bank.put("Anil",35000.5f);
		bank.put("Naveen",2258.5f);
		bank.put("Rahul",50000f);
		
		System.out.println(bank);
		
		Set<String> keys = bank.keySet();
		
		for(String key : keys) {
			Float val = bank.get(key);
			System.out.println(key+" : "+val);
			Thread.sleep(2000);
		}
	}

}
