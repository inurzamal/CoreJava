package cloning;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
			
		Employee emp1 = new Employee(1, "Rahul", new Address("Guwahati", 781022)); //creating object
		Employee emp2 = (Employee) emp1.clone(); //cloning object from emp1 to emp2
		
		// changing value in emp2 for primitive type data member
		// it will change in emp2 only, thats correct
		emp2.setName("Karan");  
		
		// changing value in emp2 for non-primitive type data member, user define class
		// here, in deep copy only emp2 will get change
		emp2.getAddress().setCity("New Delhi"); 
		
		System.out.println("Employee1 >> " + emp1);
		System.out.println("Employee2 >> " + emp2);
		
		System.out.println(emp1.hashCode()); // emp1 and emp2 will have different hashCode
		System.out.println(emp2.hashCode());
		
	}
}
