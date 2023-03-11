package equals_hashCode;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<Student> treeSet = new TreeSet<>((s1,s2)->s2.getMarks()-s1.getMarks());
		
		treeSet.add(new Student(1, "Raju", 62));
		treeSet.add(new Student(2, "Karan", 67));
		treeSet.add(new Student(3, "Ajay", 60));
		
//		for(Student s: treeSet) {
//			System.out.println(s);
//		}
		
		treeSet.stream().map(student->student.getMarks()).forEach(System.out::println);
		
//		//Natural Sorting
//		Set<Integer> tSet = new TreeSet<>();
//		tSet.add(5);
//		tSet.add(10);
//		tSet.add(7);
//		
//		tSet.forEach(System.out::println);
	}
}
