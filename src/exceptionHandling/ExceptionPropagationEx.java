package exceptionHandling;

public class ExceptionPropagationEx {
	
	int m1() {
		return 50/0;
	}
	
	void m2() {
		m1();
	}
	
	void m3() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
	
	
	public static void main(String[] args) {
		
		ExceptionPropagationEx obj = new ExceptionPropagationEx();
		obj.m3();
		
		System.out.println("Normal Flow of the program..");
	}
}
