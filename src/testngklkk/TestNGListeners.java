package testngklkk;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TestNGListeners extends BaseTest implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Starting test : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed : " + result.getName());
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped : " + result.getName());	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("Execution starting ..."+ context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution Completed "+ context.getName());	
	} 

	
	
	
	

}
