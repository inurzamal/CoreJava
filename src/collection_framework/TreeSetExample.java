package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet is an implementation of the SortedSet interface in java that uses a red-black tree for storage. By default, it maintains an ascending order. It contains unique elements only. It doesn’t allow null elements. Access and retrieval times are quite fast.
 * To add the user-defined object into TreeSet, we need to implement a Comparable interface. 
 */

class Car implements Comparable<Car>{
	
	int modelNo;
	String name, city;
	int stock;
	
	public Car() {
		super();
	}
	
	public Car(int modelNo, String name, String city, int stock) {
		
		this.modelNo = modelNo;
		this.name = name;
		this.city = city;
		this.stock = stock;
	}


	@Override
	public int compareTo(Car o) {
		
		return this.stock - o.stock;
	}
	
}

public class TreeSetExample {

	public static void main(String[] args) {
		
		SortedSet<Car> set = new TreeSet<Car>();
		
		set.add(new Car(1, "Altroz", "Guwahati", 10));
		set.add(new Car(2, "Swift", "Bengalore", 20));
		set.add(new Car(3, "BMW", "Hyderabad", 5));
		
		for(Car c: set) {
			System.out.println(c.modelNo+" "+c.name+" "+c.city+" "+c.stock);
		}
		
		//set.forEach(c->System.out.println(c.modelNo+" "+c.name+" "+c.city+" "+c.stock));
	}

}
