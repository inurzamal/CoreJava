package strings;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append(" World");
		
		System.out.println(sb); //Hello World
		
		sb.replace(1, 3, "java");
		
		System.out.println(sb); //Hjavalo World
	}
}
