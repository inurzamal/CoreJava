package strings;

public class ReserseStringEx {
	
	private String reverse(String str) {		
		char ch[] = str.toCharArray();	
		String rev="";		
		for(int i=ch.length-1; i>=0; i--) {
			rev += ch[i];
		}	
		return rev;
	}

	public static void main(String[] args) {
		ReserseStringEx r = new ReserseStringEx();
		System.out.println(r.reverse("hello"));
	}
}
