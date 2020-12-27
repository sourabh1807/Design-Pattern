package design.pattern;

import javax.management.RuntimeErrorException;

public class SynchronisedSingleton {

	private volatile static SynchronisedSingleton instance = null;
	
	private SynchronisedSingleton() {
		
		if(instance != null)
			throw new RuntimeErrorException(null, "This class can be access through getInstance()");
	}
	
	public static SynchronisedSingleton getInstance() {
		
		if(instance == null) {
			synchronized(SynchronisedSingleton.class) {
				if(instance == null) {
					instance = new SynchronisedSingleton();
				}
			}
			}
		
		return instance;
		
	}
	
	
	// this helps to avoding  create another object while serialization 
	protected Object readResolve() {
		return getInstance();
	}
}
