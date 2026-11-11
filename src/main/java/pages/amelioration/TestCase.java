package pages.amelioration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestCase {

    private WebDriver driver;
    private By testCaseTitle = By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2/b");

    public TestCase(WebDriver driver){
        this.driver= driver;
    }
    public void isTestCaseVisible(String title){
        Assert.assertEquals(driver.findElement(testCaseTitle).getText(),title);
    }


}
