package equals_hashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(6);
		set.add(7);
		
		System.out.println(set.contains(10));
		
		/*...................................*/
		
		Set<Student> set2 = new HashSet<>();
		set2.add(new Student(1, "Rahul", 75));
		set2.add(new Student(2, "Karan", 77));
		set2.add(new Student(3, "Sunil", 60));
		
		
		Set<Student> set3 = new HashSet<>();
		set3.add(new Student(1, "Rahul", 75));
		set3.add(new Student(2, "Karan", 77));
		set3.add(new Student(3, "Sunil", 60));
		
		System.out.println(set2.contains(new Student(1, "Rahul", 75)));
		System.out.println(set2.equals(set3));
		
		/*...................................*/
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Ajay");
		
		Student student2 = new Student();
		student2.setId(1);
		student2.setName("Raju");
		
		Map<Integer, String> map = new HashMap<>();
		map.put(student1.getId(), "abc");
		map.put(student2.getId(), "xyz"); // student1 and student2 have same id, so previous value will get replaced
		
		System.out.println(map);

	}

}
