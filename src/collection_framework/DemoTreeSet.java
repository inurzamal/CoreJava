package collection_framework;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		
		  TreeSet<String> al=new TreeSet<String>();  
		  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  
		  al.forEach(i->System.out.println(i));
	}
}
