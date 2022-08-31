package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		String str = "Programming";
		
		char[] c = str.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<c.length-1; i++) {
			set.add(c[i]);
		}
		set.forEach(System.out::print);				
	}
}
