package collection_framework;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("Apple");
		set.add("Mango");
		set.add("Orange");

		set.forEach(i->System.out.println(i));

	}

}
