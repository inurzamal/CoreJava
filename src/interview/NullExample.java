package interview;

public class NullExample {
	
	void doSomething(Object o) {
		System.out.println("Object class ");
	}
	
	void doSomething(String s) {
		System.out.println("String class invoked");
	}

	public static void main(String[] args) {

		NullExample t1 = new NullExample();
		t1.doSomething(null);
	}
}
