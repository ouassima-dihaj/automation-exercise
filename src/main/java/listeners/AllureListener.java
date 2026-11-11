package listeners;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;

public class AllureListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(">>> Test failed, taking screenshot...");

        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriver();

        ScreenshotUtils.takeScreenshot(driver);
    }
}