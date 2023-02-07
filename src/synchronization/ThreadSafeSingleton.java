package synchronization;

//Java code to explain double check locking
class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}

			}
		}
		return instance;
	}
}

public class ThreadSafeSingleton {

	public static void main(String[] args) {

		Singleton instance = Singleton.getInstance();
		System.out.println(instance.hashCode());

	}

}
