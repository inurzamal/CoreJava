package files;

import practice.InheritanceExample;

public class TestProtected extends InheritanceExample{

	public static void main(String[] args) {
		
		TestProtected t1 = new TestProtected();
		
		t1.display(); //calling protected method of parent class present inside another package 
	}
}
