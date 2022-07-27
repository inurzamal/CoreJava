package breakSingleton;

public class SingletonDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		SingletonClass instance1 = SingletonClass.getInstance();
		System.out.println(instance1.hashCode());
		
		SingletonClass instance2 = (SingletonClass) instance1.clone();
		System.out.println(instance2.hashCode());
	}
}
