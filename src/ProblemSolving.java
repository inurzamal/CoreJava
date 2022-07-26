import java.util.Scanner;

public class ProblemSolving {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter a number: ");		
		int n = input.nextInt();		
		input.close();
		
		if(n%3==0 && n%5==0)
			System.out.println("fizzbuzz");
		else if(n%3==0)
			System.out.println("fizz");
		else if(n%5==0)
			System.out.println("buzz");
		else
			System.out.println(Integer.toString(n));
	}
}
