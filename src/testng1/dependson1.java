package testng1;

import org.testng.annotations.Test;

public class dependson1 {

	@Test()
	public void m4() {
		System.out.println("pooja");
	}
	
	
	
	@Test()
	public void m5() {
		System.out.println("ashish");
	}
	
	@Test(dependsOnMethods ={"testng1.dependson.m3","testng1.dependson.m1"})
	public void m7() {
		System.out.println("prasad");
	}
	
	
	
}
