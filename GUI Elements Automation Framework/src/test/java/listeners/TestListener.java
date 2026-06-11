package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentManager;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        ExtentManager.getExtentReport();
    }

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("LISTENER --> "
                + result.getMethod().getMethodName());

        ExtentTest test = ExtentManager.getExtentReport()
                .createTest(
                        result.getTestClass().getRealClass().getSimpleName()
                        + " - "
                        + result.getMethod().getMethodName());

        ExtentManager.setTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentManager.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentManager.getTest().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        ExtentManager.getTest().skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        ExtentManager.getExtentReport().flush();
    }
}