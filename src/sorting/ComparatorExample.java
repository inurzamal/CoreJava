package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee2{
	
	int id;
	String name;
	float salary;
	
	public Employee2() {}
	
	public Employee2(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

class AgeComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 s1, Employee2 s2) {
		
		if(s1.salary == s2.salary)
			return 0;
		else if(s1.salary > s2.salary)
			return 1;
		else 
			return -1;
	}
}

//lets create another comparator, this is additional
class NameComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		
		return o1.name.compareTo(o2.name);
	}	
}

public class ComparatorExample {

	public static void main(String[] args) {

		ArrayList<Employee2> al = new ArrayList<Employee2>();
		
		al.add(new Employee2(1,"Rahul", 8000));
		al.add(new Employee2(2,"Karan", 4000));
		al.add(new Employee2(3,"Ajay", 7000));
		
		Collections.sort(al, new AgeComparator());
		
		for(Employee2 emp: al) {
			System.out.println(emp.id + " " + emp.name+ " "+emp.salary);
		}
		
		//Name Comparator
		System.out.println("Sorting by names");
		Collections.sort(al, new NameComparator());
		
		al.forEach(i->System.out.println(i.id + " " + i.name+ " "+i.salary));

	}

}
