package strings;

public class MyStringExample {

	public static void main(String[] args) {

		//Storing in String constant pool, s1 & s2 pointing to same location in the pool
		String s1 = "Hello";
		String s2 = "Hello";
		
		//s3 and s4 are allocated separate memory in heap
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println(s1 +" "+ s2 +" "+ s3+ " " + s4);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==s4); // comparing the two object, which is different here
		System.out.println(s3.equals(s4)); // compares values inside objects. So, true.
		
					
		//Mutable String
		
		StringBuilder s = new StringBuilder("Hi");
		s.append(" Java");
		System.out.println(s);		
	}
}
