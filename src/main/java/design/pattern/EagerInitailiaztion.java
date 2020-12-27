package design.pattern;

public class EagerInitailiaztion {
	
	private static EagerInitailiaztion instance = new EagerInitailiaztion();
	
	private EagerInitailiaztion() {}
	
	public static EagerInitailiaztion getInstance() {
		return instance;
	}

}
