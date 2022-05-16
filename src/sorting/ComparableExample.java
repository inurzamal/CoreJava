package sorting;

import java.util.ArrayList;
import java.util.Collections;

class Employee1  implements Comparable<Employee1>{
	
	int id;
	String name;
	float salary;
	
	public Employee1(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//	@Override
//	public int compareTo(Employee1 e) {
//		if(this.salary == e.salary)
//			return 0;
//		else if(this.salary>e.salary)
//			return 1;
//		else
//			return -1;		
//	}
	
	@Override
	public int compareTo(Employee1 e) {
		return (int) (this.salary - e.salary);	
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class ComparableExample {

	public static void main(String[] args) {

		ArrayList<Employee1> al = new ArrayList<Employee1>();
		
		al.add(new Employee1(1,"Rahul", 5000));
		al.add(new Employee1(2,"Karan", 4000));
		al.add(new Employee1(3,"Ajay", 7000));
		
		
		Collections.sort(al);
		
		for(Employee1 emp: al) {
			System.out.println(emp.id + " " + emp.name+ " "+emp.salary);
		}
		
		//System.out.println(al.toString());
		//al.forEach(i->System.out.println(i));

	}

}
