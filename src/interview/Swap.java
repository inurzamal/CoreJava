package interview;

public class Swap {
	
	void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " "+ b);
	}
	
	void swap2(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a + " "+ b);
	}

	public static void main(String[] args) {
		
		int x=10, y=20;
		
		Swap s = new Swap();
		s.swap2(x, y);

	}
}
