package multithreading;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name = "";
	public int count = 0;

	public void studentName(String s, List<String> list) {
		// Only one thread is permitted to change student's name at a time.
		synchronized (this) {
			name = s;
			count++; // how many threads change geek's name.
		}

		list.add(s); // All other threads are permitted to add student name into list.
	}
}

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student();
		List<String> list = new ArrayList<>();
		s1.studentName("Rahul", list);
		System.out.println(s1.name);
	}

}
