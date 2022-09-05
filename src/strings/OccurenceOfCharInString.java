package strings;

import java.util.HashMap;
import java.util.Map;

class OccurenceOfCharInString {
	
	static void characterCount(String str) {

		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		char[] chArray = str.toCharArray(); // Converting given string to char array

		// checking each char of strArray
		for (char c : chArray) {
			if (hmap.containsKey(c)) {

				// If char is present in HashMap,incrementing it's count by 1
				hmap.put(c, hmap.get(c) + 1);
			} else {

				// If char is not present in hmap, putting this char to hmap with 1 as it's value
				hmap.put(c, 1);
			}
		}

		// Printing the charCountMap
//		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		hmap.entrySet().forEach(i->System.out.println(i.getKey()+ " "+i.getValue())); 
		
		
	}

	// Driver Code
	public static void main(String[] args) {
		String str = "hello";
		characterCount(str);
	}
}
