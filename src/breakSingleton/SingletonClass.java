package breakSingleton;

import java.io.Serializable;

class SingletonClass extends MyClone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static SingletonClass x = null;

	//preventing from Reflection API
	private SingletonClass() throws IllegalAccessException {
		if (x != null)
			throw new IllegalAccessException("Object can't be created using reflection");
	}
	
	//preventing from clone() method

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	//preventing from serialization & deserialization
	protected Object readResolve() {
		return x;
	}

	public static SingletonClass getInstance() throws IllegalAccessException {

		if (x == null) {
			x = new SingletonClass();
			return x;
		}
		return x;
	}
}