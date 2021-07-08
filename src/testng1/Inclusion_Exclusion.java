package testng1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Inclusion_Exclusion {

	@Test(priority = 1)
	public void testcase1() {
		Reporter.log("akshay is op");
	}
	
	@Test(priority = 2)
	public void testcase2() {
		Reporter.log("omkar is op");
	}
	
	@Test(priority = 3)
	public void testcase3() {
		Reporter.log("pratik is op");
	}
	
	
	@Test(priority = 4)
	public void testcase4() {
		Reporter.log("rajesh is op");
	}
	
	
	
	
	
	
	
	
}
