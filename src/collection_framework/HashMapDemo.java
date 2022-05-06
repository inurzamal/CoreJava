package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(5, "Apple");
		map.put(6, "Grapes");
		map.put(7, "Banana");
		map.put(8, "Orange");
		map.put(6,"Black berry"); //trying duplicate key

		System.out.println(map);
		System.out.println(map.get(6));
		
		System.out.println("Iterating HashMap using lambda..");
		
		map.forEach((i,j)->System.out.println(i + " " + j));
		

		System.out.println("Iterating Hashmap...");
		
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}			
	}
}

/*
 * 
 * In this example, we are storing Integer as the key and String as the value, so we are using HashMap<Integer,String> as the type. 
 * The put() method inserts the elements in the map. 
 * To get the key and value elements, we should call the getKey() and getValue() methods. 
 * The Map.Entry interface contains the getKey() and getValue() methods. But, we should call the entrySet() method of Map interface 
 * to get the instance of Map.Entry.
 * 
 */
