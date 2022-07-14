package collection_framework;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparison {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Java");
		map1.put(2, "AWS");
		map1.put(3, "Angular");
		
		HashMap<Integer, String> map2 = new HashMap<>();	
		map2.put(3, "Angular");
		map2.put(2, "AWS");
		map2.put(1, "Java");
		
		HashMap<Integer, String> map3 = new HashMap<>();	
		map3.put(1, "CSE");
		map3.put(2, "ECE");
		map3.put(3, "CE");
		
		System.out.println(map1.equals(map2)); //true, entries are equal
		
		System.out.println(map1.equals(map3)); //false
		
		HashMap<Integer, String> map4 = new HashMap<>();	
		map4.put(5, "CSE");
		map4.put(2, "ECE");
		map4.put(3, "CE");
		
		System.out.println(map1.keySet().equals(map2.keySet())); //true
		System.out.println(map3.keySet().equals(map4.keySet())); //false
		
		
		HashSet<String> set1 = new HashSet<>(map1.values());
		HashSet<String> set2 = new HashSet<>(map2.values());
		HashSet<String> set3 = new HashSet<>(map3.values());
		
		System.out.println(set1.equals(set2)); //true
		System.out.println(set1.equals(set3));  //false

	}

}
