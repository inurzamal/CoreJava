package strings;

public class CountCharacterOccurence {
	
	private static int countOccurence(String str, char c) {
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i)==c) {
				count++;
			}
		}	
		return count;		
	}

	public static void main(String[] args) {
		int countOccurence = CountCharacterOccurence.countOccurence("Hellooo", 'o');
		System.out.println(countOccurence);

	}
}
