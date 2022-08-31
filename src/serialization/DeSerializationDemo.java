package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("f.txt");
		ObjectInputStream in = new ObjectInputStream(fis);
		
		Student student = (Student) in.readObject();
		
		in.close();
		fis.close();
		
		System.out.println("Object has been deserialized ");
		System.out.println("id = " + student.id);
		System.out.println("name = " + student.name);

	}
}
