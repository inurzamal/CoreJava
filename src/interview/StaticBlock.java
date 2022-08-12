package interview;
// Java Program to Illustrate How Static block is Called

class Test {

	static int i;
	int j;

	static
	{
		i = 10;
		System.out.println("static block called ");
	}
}


public class StaticBlock {
	
	public static void main(String args[])
	{
//		Test t1 = new Test();
//		t1.j = 20;
//		System.out.println(t1.j); //static block called
				
		System.out.println(Test.i); // static block called 20
	}
}
