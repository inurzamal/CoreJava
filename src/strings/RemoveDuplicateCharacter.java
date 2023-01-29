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









//String str = "Hellooo";
//char[] ch = str.toCharArray();
//
//Set<Character> set = new LinkedHashSet<>();
//List<Character> list = new ArrayList<Character>();
//
//for(int i = 0; i<ch.length-1; i++) {
//	if(set.add(ch[i])==false) {
//		list.add(ch[i]);
//	}
//		
//}
//list.forEach(System.out::print);
