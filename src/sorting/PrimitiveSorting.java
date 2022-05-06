package sorting;

import java.util.Arrays;

class Employeee {

	int id;
	String name;

	public Employeee() {
		super();
	}
	
	public Employeee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}


public class PrimitiveSorting {

	public static void main(String[] args) {

		int[] intArr = {5, 3, 10, 7};		
		Arrays.sort(intArr);	//comparing or sorting primitive type: Array, List, etc.	
		System.out.println(Arrays.toString(intArr));
					
		Employee[] empArr = new Employee[4]; //array of type Employee		
		empArr[0] = new Employee(5, "Raju");
		empArr[1] = new Employee(3, "Ajay");
		empArr[2] = new Employee(10, "Kala");
		empArr[3] = new Employee(7, "Manisha");
		
		Arrays.sort(empArr); //can't sort, because empArr is not primitive object. We can do the comparison by implementing Comparable Interface and overriding compareTo() method	
		System.out.println(Arrays.toString(empArr));
		
	}
}
