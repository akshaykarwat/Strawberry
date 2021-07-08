package testng12;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups2 {
	@Test(priority = 6, groups = "regression")
	public void testcase6() {
		Reporter.log("akshay3 is op");
	}
}
