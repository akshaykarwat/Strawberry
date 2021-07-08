package testng12;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups {

	@Test(priority = 1, groups = "sanity")
	public void testcase1() {
		Reporter.log("akshay is op");
	}

	@Test(priority = 2, groups = "smoke")
	public void testcase2() {
		Reporter.log("akshay2 is op");
	}

	@Test(priority = 3, groups = "regression")
	public void testcase3() {
		Reporter.log("akshay3 is op");
	}

	@Test(priority = 4, groups = "smoke")
	public void testcase4() {
		Reporter.log("akshay2 is op");
		Assert.fail();
	}

	@Test(dependsOnGroups = { "smoke", "sanity" })
	public void omkar() {
		Reporter.log("omkar");
	}

}
