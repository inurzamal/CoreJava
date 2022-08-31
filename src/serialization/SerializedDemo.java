package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class SerializedDemo {

	public static void main(String[] args) {
		try {
			Student s1 = new Student(101, "Rani");
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Object Serialized successfully");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
