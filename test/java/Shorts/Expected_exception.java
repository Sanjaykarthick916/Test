package Shorts;

import org.testng.annotations.Test;

public class Expected_exception {
	@Test(expectectedExceptions=Throwable.class)
	public void expec() {
		String a =null;
		System.out.println("passed");
		System.out.println(a.length());
	}

}
