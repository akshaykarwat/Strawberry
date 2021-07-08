package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToruMethodParallay {

	@Test(priority = 1)
	public void m1() {
		Reporter.log("akshay");
	}
	
	
	@Test(priority = 2)
	public void m2() {
		Reporter.log("omkar");
	}
	
	
	
	
}
