package breakSingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemo {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, 
	InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
		SingletonClass instance1 = SingletonClass.getInstance();
		System.out.println(instance1.hashCode());
		
		//serialize singleton object to a file
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();
		
		// deserialize singleton object from the file
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		SingletonClass instance2 = (SingletonClass) in.readObject();
		in.close();
		
		System.out.println(instance2.hashCode());
		
		
		/*
		 * // break Singleton by clone() method SingletonClass instance2 =
		 * (SingletonClass) instance1.clone(); System.out.println(instance2.hashCode());
		 */

		
		/*
		 * //break Singleton by Reflection API SingletonClass reflectionInstance = null;
		 * 
		 * Constructor<?>[] constructors =
		 * SingletonClass.class.getDeclaredConstructors(); for(Constructor<?> c :
		 * constructors) { c.setAccessible(true); reflectionInstance = (SingletonClass)
		 * c.newInstance(); }
		 * 
		 * System.out.println(reflectionInstance.hashCode());
		 */


	}
}
