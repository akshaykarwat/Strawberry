package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class depends {
	
		
		
		@Test
		public void m1() {
			System.out.println("akshay");
		}
		
		
		@Test()
		public void m2() {
			System.out.println("omkar");
			Assert.fail();
		}
		
		@Test(dependsOnMethods = {"m1","m2"})
		public void m3() {
			System.out.println("pratik");
		}
		
		
		
	}


