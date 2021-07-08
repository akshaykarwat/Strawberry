package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToruMethodParallay1 {

	@Test(priority = 3)
	public void m3() {
		Reporter.log("yogesh");
	}
	
	
	@Test(priority = 4)
	public void m4() {
		Reporter.log("pratik");
	}
	
}
