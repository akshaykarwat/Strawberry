package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependson {

	
	
	@Test
	public void m1() {
		
		System.out.println("akshay");
		Assert.fail();
	}
	
	
	@Test()
	public void m2() {
		System.out.println("omkar");
	}
	
	@Test
	public void m3() {
		System.out.println("pratik");
	}
	
	
	
}
