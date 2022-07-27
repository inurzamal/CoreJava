package breakSingleton;

class SingletonClass extends MyClone{
	
	private static SingletonClass x = null;
	
	private SingletonClass() {}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public static SingletonClass getInstance() {
		
		if(x == null) {
			x = new SingletonClass();
			return x;
		}
		return x;	
	}
}