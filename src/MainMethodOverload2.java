public class MainMethodOverload2 {
	
//original main() method  
	public static void main(String args[]) {
	
        //calling overloaded main() method from the original main() method  
		MainMethodOverload2.main();
	}

//overloaded main() method  
	public static void main() {
		System.out.println("Overloaded main() method invoked");
	}
}