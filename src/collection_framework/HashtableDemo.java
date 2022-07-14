package collection_framework;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(10, "Mango");
		ht.put(11, "Apple");
		ht.put(12, "Banana");
		ht.put(13, "Orange");
		ht.put(10,"Grapes");
		
		System.out.println(ht);	//{10=Grapes, 13=Orange, 12=Banana, 11=Apple}	
		
		System.out.println(ht.get(11));	 //Apple
		
		ht.forEach((i,j)->System.out.println(i + " " + j));
	}
}
