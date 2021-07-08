package testng1;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Tocall_ITestListner_inteface  extends baseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("starting test:" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase passed:" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			ss.screnshot(driver, result.getName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Testcase failed:" + result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped:" + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution starting:" + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution finish:" + context.getName());

	}

}
