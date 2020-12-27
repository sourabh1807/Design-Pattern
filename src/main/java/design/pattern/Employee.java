package design.pattern;

import java.util.Date;

public final class Employee {
	
	private final String name ;
	private final Date date;
	
	Employee(String name ,Date date){
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	
}
