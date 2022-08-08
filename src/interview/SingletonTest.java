package interview;

class Singleton {
	
	private static Singleton x = null;
	private String name;
	
	private Singleton() {
		name = "Hello, I am from SIngleton class";
	}
		
	public static Singleton getInstance() {		
		if(x == null) {
			x = new Singleton();
		}		
		return x;		
	}
	
	public String getName() {
		return name;
	}	
}

public class SingletonTest{
	
	public static void main(String[] args) {
		
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		Singleton i3 = Singleton.getInstance();	
		
		System.out.println(i1.getName()+" : "+i1.hashCode()); //same value same hashCode
		System.out.println(i2.getName()+" : "+i2.hashCode()); //same value same hashCode
		System.out.println(i3.getName()+" : "+i3.hashCode()); //same value same hashCode	
	}	
}
