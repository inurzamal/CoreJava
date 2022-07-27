package demo;

class A {

	void add() {
		System.out.println("add() method from class A");
	}

	void delete() {
		System.out.println("delete() method from class A");
	}
}

class B extends A {

	void add() {
		System.out.println("add() method from child class B");
	}

	void delete() {
		System.out.println("delete() method from child class B");
	}

	void remove() {
		System.out.println("remove() method in class B which is not a overridden method");
	}
}

public class Test {

	public static void main(String[] args) {

		A a = new B();
		a.add();
		a.delete();
		// a.remove(); //compile time error
	}
}
