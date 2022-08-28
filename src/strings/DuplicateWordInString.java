package strings;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateWordInString {

	public static void main(String[] args) {

		String str = "This is a demo a paragraph demo is";
		
		str = str.toLowerCase();
		
		String[] arrayString = str.split(" ");
		
		HashSet<String> set = new HashSet<>();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<arrayString.length; i++) {
			if(set.add(arrayString[i]) == false) {
				list.add(arrayString[i]);
			}
		}
		
		list.forEach(i->System.out.println(i));
	}
}
