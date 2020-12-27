package design.pattern;

import java.util.Date;

public class Test {

	public static void main(String args[]) {
		
		Employee e = new Employee("abc",new Date());
		e.getDate().setTime(1233333);
		//Wed Dec 02 15:50:05 IST 2020
		System.out.println(e.getDate());
	}
}
