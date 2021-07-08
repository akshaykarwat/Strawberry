package testng1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssert {

//	@Test(priority = 1)
//	public void test1() {
//		
//	Reporter.log("akshay",true);
//	Assert.assertEquals(10.10, 10.8, "testcase is fail");
//	System.out.println("hi");
//	
	
	
	@Test(priority = 1)
	public void test1() {
		SoftAssert sa= new SoftAssert();
	Reporter.log("akshay",true);
	sa.assertEquals(10.10, 10.8, "testcase is fail");
	System.out.println("hi");
	System.out.println("asaram");
	sa.assertAll();
	}
	
	
	
	
	
	
	}

	
	
	
	
