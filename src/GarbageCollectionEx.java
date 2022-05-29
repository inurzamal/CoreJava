public class GarbageCollectionEx {

	public static void main(String[] args) {

		GarbageCollectionEx t = new GarbageCollectionEx();
		
		System.out.println(t.hashCode());
		
		t = null;
		
		//calling garbage collector manually
		System.gc(); // gc() will call finalize() method
		
		System.out.println("End...");
	}
	
	@Override protected void finalize() {
		System.out.println("finalize() method is called- proved");
	}

}
