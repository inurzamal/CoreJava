package sorting;

import java.util.Arrays;

//Custom object sorting/comparing using Comparable Interface by overriding compareTo() method

class Employee implements Comparable<Employeee> {

	int id;
	String name;

	public Employee() {
		super();
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employeee o) {
		return this.id-o.id;
	}
}

public class CustomSorting_Comparable {

	public static void main(String[] args) {

		Employeee[] empArr = new Employeee[4]; //array of type Employee		
		empArr[0] = new Employeee(5, "Raju");
		empArr[1] = new Employeee(3, "Ajay");
		empArr[2] = new Employeee(10, "Kala");
		empArr[3] = new Employeee(7, "Manisha");
		
		Arrays.sort(empArr);
		System.out.println(Arrays.toString(empArr));
	}

}
