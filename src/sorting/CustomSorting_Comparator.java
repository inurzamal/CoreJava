package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Custom object sorting using Comparator Interface by overriding compare() method

class Student {

	int id;
	String name;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class CustomSorting_Comparator implements Comparator<Student> {
	
	@Override
	public int compare(Student a, Student b) {
		
		return a.name.compareTo(b.name);
	}
	
	
	
	public static void main(String[] args) {
			
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student(6,"Rana"));
		student.add(new Student(1,"Kiyaan"));
		student.add(new Student(3,"Rahat"));
		student.add(new Student(2,"Hasibul"));
		
		Collections.sort(student, new CustomSorting_Comparator());
		
		for (int i = 0; i < student.size(); i++)
            System.out.println(student.get(i)); //printing indices/object of ArrayList will print toString() method
		
	}

}
