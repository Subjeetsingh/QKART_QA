package QKART_TESTNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

    public void onTestFailure(ITestResult result){
        QKART_Tests.takeScreenshot(QKART_Tests.driver,"Failure", result.getName());
    }

    public void onTestStart(ITestResult result){
        QKART_Tests.takeScreenshot(QKART_Tests.driver,"Start", result.getName());
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("Testcase is succesfull  : "+result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver,"Success", result.getName());
    }
}