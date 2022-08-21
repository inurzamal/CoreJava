package strings;

public class ReverseWordInList {

	public static void main(String[] args) {

		String str = "Hello World";
		
		String[] split = str.split(" ");
		
		//System.out.println(split[0]); // Hello
		
		for(int i=0; i<split.length; i++) {
			
			for(int j= split[i].length()-1; j>=0; j--) {
				System.out.print(split[i].charAt(j));
			}
			System.out.print(" ");
		}	
	}
}
