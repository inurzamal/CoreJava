
public class PaternPrinting {

	public static void main(String[] args) {
		
		int i, j, k=1;
		
		for(i = 2; i<=5; i++) {
			for(j=1; j<i; j++)
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
}
